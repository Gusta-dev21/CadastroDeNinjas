package eu.com.example.Eu.Missoes;

import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {
    
    //quando a model pega os valores do db ela mapeia no DTO
    public MissoesDTO map(MissoesModel missoesModel){
             MissoesDTO missoesDTO = new MissoesDTO();
             
             missoesDTO.setID(missoesModel.getID());
             missoesDTO.setNome(missoesModel.getNome());
             missoesDTO.setRank_missoes(missoesModel.getRank_missoes());
            

             return missoesDTO;

    }



            //quando o DTO pega os valores dos controllers ele mapeia no Model
             public MissoesModel map(MissoesDTO missoesDTO){
                    
                 MissoesModel missoesModel = new MissoesModel();
                    missoesModel.setID(missoesDTO.getID());
                    missoesModel.setNome(missoesDTO.getNome());
                    missoesModel.setRank_missoes(missoesDTO.getRank_missoes());
                  

                    return missoesModel;

             }
    }

