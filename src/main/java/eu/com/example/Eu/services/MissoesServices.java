package eu.com.example.Eu.services;

import java.util.List;

import org.springframework.stereotype.Service;

import eu.com.example.Eu.Missoes.MissoesModel;
import eu.com.example.Eu.Missoes.MissoesRepository;

@Service
public class MissoesServices {

    private MissoesRepository missoesRespository;

    public MissoesServices(MissoesRepository missoesRespository) {
        this.missoesRespository = missoesRespository;
    }

    public List<MissoesModel> listarMissoes(){
        return missoesRespository.findAll();
    }

    

}   
