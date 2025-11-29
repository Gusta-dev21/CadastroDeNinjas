package eu.com.example.Eu;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.com.example.Eu.Missoes.MissoesModel;
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
    public List<MissoesModel> listarMissoes(){
        return missoesServices.listarMissoes();
    }

    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missoes criadas";
    }

    @PutMapping("/alterar")
    public String alterarMissoes(){
            return "missoes alterada";
    }
    @DeleteMapping("/deletar")
    public String deletarMissoes(){
        return "missoes deletadas";
    }

}
