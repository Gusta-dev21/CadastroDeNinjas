package eu.com.example.Eu;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.com.example.Eu.Missoes.MissoesDTO;
import eu.com.example.Eu.services.MissoesServices;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

        private MissoesServices missoesServices;

        public MissoesController(MissoesServices missoesServices){
                this.missoesServices = missoesServices;
        }
    
    //GET - MANDA 
    @GetMapping("/listar")
    public List<MissoesDTO> listarMissoes(){
        return missoesServices.listarMissoes();
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarMissoes(@RequestBody MissoesDTO missoesDTO){
            MissoesDTO missoesNovo = missoesServices.criarMissoes(missoesDTO);
            return ResponseEntity.status(HttpStatus.CREATED).body("Missão criada com Sucesso: " + missoesNovo.getNome() + " ID: " + missoesNovo.getID());
        
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<String> alterarMissoes(@PathVariable Long id,@RequestBody MissoesDTO missoesDTO){
           missoesServices.atualizarMissoes(id, missoesDTO);
           return ResponseEntity.ok("Missão deletada com sucesso");

    }
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarMissoes(@PathVariable Long id){
                missoesServices.deletarMissoes(id);
                return ResponseEntity.status(HttpStatus.ACCEPTED).body("Missão deletada com sucesso");
    }

}
