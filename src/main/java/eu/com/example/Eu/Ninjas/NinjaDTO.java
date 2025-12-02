package eu.com.example.Eu.Ninjas;

import eu.com.example.Eu.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data//getters ane setters
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {
  

    
    
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private MissoesModel missoes;
    private String especial;
    private String imgurl;
    private String rank;


  
    
    

}

