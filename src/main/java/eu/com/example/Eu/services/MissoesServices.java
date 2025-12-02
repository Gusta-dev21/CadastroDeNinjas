package eu.com.example.Eu.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import eu.com.example.Eu.Missoes.MissoesDTO;
import eu.com.example.Eu.Missoes.MissoesMapper;
import eu.com.example.Eu.Missoes.MissoesModel;
import eu.com.example.Eu.Missoes.MissoesRepository;

@Service
public class MissoesServices {

    private MissoesRepository missoesRepository;
    private MissoesMapper missoesMapper;

    public MissoesServices(MissoesRepository missoesRepository,MissoesMapper missoerMapper) {
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    public List<MissoesDTO> listarMissoes(){
        List <MissoesModel> missoesList = missoesRepository.findAll();
        return missoesList.stream().map(missoesMapper::map).collect(Collectors.toList());

    }

    public MissoesDTO criarMissoes(MissoesDTO missoesDTO){
            MissoesModel missoesModel = missoesMapper.map(missoesDTO);
            var missoes = missoesRepository.save(missoesModel);
            return missoesMapper.map(missoes);
    }

    public MissoesModel atualizarMissoes(Long id,MissoesDTO missoesDTO){
                Optional<MissoesModel> missoesOptional = missoesRepository.findById(id);
                if(missoesOptional.isPresent()){
                        missoesDTO.setID(id);
                        MissoesModel missoesModel = missoesMapper.map(missoesDTO);
                        return missoesRepository.save(missoesModel);
                       
                    
                }else {
                    return null;
                }

    }

    public void deletarMissoes(Long id){
        Optional<MissoesModel> missoesOptional = missoesRepository.findById(id);
        if(missoesOptional.isPresent()){
                missoesRepository.deleteById(id);
        }

    }

    

}   
