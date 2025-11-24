package eu.com.example.Eu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class Controllers {

    @GetMapping("/")
    public String Hello(){
            return "Bem vindo ao cadastro de ninjas";
    }
}
