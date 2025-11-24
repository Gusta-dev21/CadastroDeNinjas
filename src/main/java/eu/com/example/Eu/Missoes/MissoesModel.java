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
    private List<NinjaModel> ninjas;
    
   


}
