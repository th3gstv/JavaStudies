package NívelIntermediário;

public class Missoes {
    private String nome;
    private RankDeMissoes rank;

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }
    //Metodo para mostrar mais informacoes
    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + "\nRank: " + rank + "\nDescrição: " + rank.getDescricao() + "\nDificuldade: " + rank.getDificuldade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}

