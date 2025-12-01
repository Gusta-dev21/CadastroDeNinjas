package eu.com.example.Eu.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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


    public List<NinjaDTO> listarNinjas(){
        
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream().map(ninjaMapper::map).collect(Collectors.toList());
    }

    public NinjaDTO ListarNinjaporID(Long id){
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(id);
        return ninjaID.map(ninjaMapper::map).orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        var ninja = ninjaRepository.save(ninjaModel);
         return ninjaMapper.map(ninja);
    }

    public void deletarNinjaPorID(Long id){
         ninjaRepository.deleteById(id);
    }

    public NinjaModel atualizarNinja(Long id,NinjaDTO ninjaDTO){
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(id);
        if(ninjaID.isPresent()){
                ninjaDTO.setId(id);
                 NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
                    return ninjaRepository.save(ninjaAtualizado);
        }else {
                return null;
        }

        
    }
}
