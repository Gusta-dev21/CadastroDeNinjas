package eu.com.example.Eu.Missoes;

public enum  RankMissoes {
    A(1,"A - Facil de fazer"),
    C(2,"C - Moderado,pode haver machucados"),
    D(3,"D - Dificil,pode haver assasinatos"),
    S(4,"C - Pode haver destruição e ameaça ao mundo ninja");

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
