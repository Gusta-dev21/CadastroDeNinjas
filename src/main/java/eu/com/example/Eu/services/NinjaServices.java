package eu.com.example.Eu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import eu.com.example.Eu.Ninjas.NinjaDTO;
import eu.com.example.Eu.Ninjas.NinjaMapper;
import eu.com.example.Eu.Ninjas.NinjaModel;
import eu.com.example.Eu.Ninjas.NinjaRepository;

@Service
public class NinjaServices {
    
    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;
     

    public NinjaServices(NinjaRepository ninjaRepository,NinjaMapper ninjaMapper){
            this.ninjaRepository = ninjaRepository;
            this.ninjaMapper = ninjaMapper;
    }


    public List<NinjaModel> listarNinjas(){
        
        return ninjaRepository.findAll();
    }

    public NinjaModel ListarNinjaporID(Long id){
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(id);
        return ninjaID.orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaRepository.save(ninjaModel);
    }

    public void deletarNinjaPorID(Long id){
         ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(Long id,NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }

        return null;
    }
}
