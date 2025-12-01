package eu.com.example.Eu;

import java.util.List;

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
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninjaDTO){
           return ninjaService.criarNinja(ninjaDTO);
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
    public NinjaModel alterarNinjasporID(@PathVariable Long id,@RequestBody NinjaDTO ninjaAtualizado){
            return ninjaService.atualizarNinja(id, ninjaAtualizado);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorID(@PathVariable Long id){
       ninjaService.deletarNinjaPorID(id);
    }

    private void listarNinjas() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

