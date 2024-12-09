package NívelIntermediário;

public abstract class Hokages{
    String nome;
    int idade;
    boolean vivoOuNao;
    double altura;
    int missoes;
    double saldoBancario;

    public abstract void sabedoriaHokage();


    public Hokages() {
    }

    /*
    public Hokages(String nome, int idade, boolean vivoOuNao){
        //Construtor com argumento
            this.nome = nome;
            this.idade = idade;
            this.vivoOuNao = vivoOuNao;
    }
    */

    public Hokages(String nome, int idade, boolean vivoOuNao, double altura, int missoes, double saldoBancario) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.altura = altura;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
    }
}
