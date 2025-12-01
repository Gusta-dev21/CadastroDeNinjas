package eu.com.example.Eu.Ninjas;

import org.springframework.stereotype.Component;


//que isso é o cara que mapeia os dados do DTO e joga para a entidade
@Component
public class NinjaMapper {
    public NinjaModel map(NinjaDTO ninjaDTO){
            NinjaModel ninjaModel = new NinjaModel();
            ninjaModel.setId(ninjaDTO.getId());
            ninjaModel.setNome(ninjaDTO.getNome());
            ninjaModel.setEmail(ninjaDTO.getEmail());
            ninjaModel.setIdade(ninjaDTO.getIdade());
            ninjaModel.setMissoes(ninjaDTO.getMissoes());
            ninjaModel.setImgurl(ninjaDTO.getImgurl());
            ninjaModel.setRank(ninjaDTO.getRank());

            return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
            
            ninjaDTO.setId(ninjaModel.getId());
            ninjaDTO.setNome(ninjaModel.getNome());
            ninjaDTO.setEmail(ninjaModel.getEmail());
            ninjaDTO.setIdade(ninjaModel.getIdade());
            ninjaDTO.setMissoes(ninjaModel.getMissoes());
            ninjaDTO.setImgurl(ninjaModel.getImgurl());
            ninjaDTO.setRank(ninjaModel.getRank());

            return ninjaDTO;
    }
}
