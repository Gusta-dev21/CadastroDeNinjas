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

import eu.com.example.Eu.Ninjas.NinjaDTO;
import eu.com.example.Eu.Ninjas.NinjaModel;
import eu.com.example.Eu.services.NinjaServices;

@RestController
@RequestMapping("/ninjas")

public class NinjaControllers {

    private NinjaServices ninjaService;

    



    public NinjaControllers(NinjaServices ninjaService) {
        this.ninjaService = ninjaService;
    }



    @GetMapping("/hello")
    public String Hello(){
            return "Bem vindo ao cadastro de ninjas";
    }
    //enviar os ninjas para criar-los
    @PostMapping("/criar")
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninjaDTO){
         NinjaDTO ninja = ninjaService.criarNinja(ninjaDTO);
         return ResponseEntity.status(HttpStatus.CREATED).body("Ninja criado com sucesso " + ninja.getNome() + " ID: " + ninja.getId()) ;

       }
   
    @GetMapping("/listar")
    public List<NinjaDTO> mostrarNinjas(){
              return ninjaService.listarNinjas();

    }
    @GetMapping("/listar/{id}")
    public NinjaDTO mostrarNinjas(@PathVariable Long id){
              return ninjaService.ListarNinjaporID(id);

    }

    public String mostrarNinjasporID(){
            return  "monstrando ninjas por id";
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<String> alterarNinjasporID(@PathVariable Long id,@RequestBody NinjaDTO ninjaAtualizado){
            if(ninjaService.ListarNinjaporID(id) != null){
                    ninjaService.atualizarNinja(id, ninjaAtualizado);
                    return ResponseEntity.ok("Ninja atualizado com sucesso");

            }else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não existe ");
            }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarNinjaPorID(@PathVariable Long id){
        if(ninjaService.ListarNinjaporID(id) != null){
                ninjaService.deletarNinjaPorID(id);
                return ResponseEntity.ok("Ninja Deletado com sucesso");

        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja Não encontrado");
        }
    }

    private void listarNinjas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

