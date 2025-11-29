package eu.com.example.Eu;

import java.util.List;


import org.springframework.web.bind.annotation.*;

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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel){
           return ninjaService.criarNinja(ninjaModel);
       }
   
    @GetMapping("/listar")
    public List<NinjaModel> mostrarNinjas(){
              return ninjaService.listarNinjas();

    }
    @GetMapping("/listar/{id}")
    public NinjaModel mostrarNinjas(@PathVariable Long id){
              return ninjaService.ListarNinjaporID(id);

    }

    public String mostrarNinjasporID(){
            return  "monstrando ninjas por id";
    }

    @PutMapping("/alterarID")
    public String alterarNinjasporID(){
            return  "Alterando ninjas por id";
    }

    @DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "Deletando ninja por id";
    }

    private void listarNinjas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

