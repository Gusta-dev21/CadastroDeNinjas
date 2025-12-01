package eu.com.example.Eu.Ninjas;

import eu.com.example.Eu.Missoes.MissoesModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_ninjas")
@AllArgsConstructor
@NoArgsConstructor
@Data

    

public class NinjaModel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;//INT
    @Column(name="nome")
    private String nome;//VARCHAR
    @Column(unique = true)
    private String email;
    @Column(name="idade")
    private int idade;//INT
    
    @ManyToOne
    @JoinColumn(name = "missoes_id") //FK  
    private MissoesModel missoes;
    @Column(name="especial")
    private String especial;

    @Column(name="imagem_ninja")
    private String imgurl;
    @Column(name="rankNinja")
    private String rank;


  
    
    

}
