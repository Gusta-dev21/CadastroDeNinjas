package eu.com.example.Eu.Missoes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.com.example.Eu.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tb_missoes")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class MissoesModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    private String nome;
    private RankMissoes rank;

    @OneToMany(mappedBy="missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;
    
   


}
