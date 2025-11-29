package eu.com.example.Eu.Missoes;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import eu.com.example.Eu.Ninjas.NinjaModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)//estrategia onde ele vai gerar os id por ordem numerica 1,2,3,4...
    @Column(name="id")
    private Long ID;
    @Column(name="nome")
    private String nome;
    @Column(name="rank_missoes")
    @Enumerated(EnumType.STRING)
    private RankMissoes rank_missoes;
  

    @OneToMany(mappedBy="missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;
    
   


}
