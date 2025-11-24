package eu.com.example.Eu.Missoes;

public enum  RankMissoes {
    A(1,"Facil de fazer"),
    C(2,"Moderado,pode haver machucados"),
    D(3,"Dificil,pode haver assasinatos"),
    S(4,"Pode haver destruição e ameaça ao mundo ninja");

    private int rank;
    private String descricao;

      RankMissoes(int rank,String descricao){
        this.rank = rank;
        this.descricao = descricao;


    }

    public int getRank(){
        return this.rank;
    }

    public String getDescricao(){
        return this.descricao;
    }



    

}
