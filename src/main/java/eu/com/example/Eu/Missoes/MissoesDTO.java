package eu.com.example.Eu.Missoes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.com.example.Eu.Ninjas.NinjaModel;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class MissoesDTO {
    
    private Long ID;
    private String nome;
    private RankMissoes rank_missoes;
   
    

}
