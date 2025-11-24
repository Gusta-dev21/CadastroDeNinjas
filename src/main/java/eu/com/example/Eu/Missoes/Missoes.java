package eu.com.example.Eu.Missoes;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import eu.com.example.Eu.Ninjas.NinjaModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_missoes")
public class Missoes {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long ID;
    private String nome;
    private RankMissoes rank;

    @OneToMany(mappedBy="missoes")
    private List<NinjaModel> ninjas;
    
    public Missoes(RankMissoes rank) {
        this.rank = rank;
    }
    public Missoes(Long iD, String nome, RankMissoes rank) {
        ID = iD;
        this.nome = nome;
        this.rank = rank;
    }


}
