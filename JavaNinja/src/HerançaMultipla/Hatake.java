package HerançaMultipla;

public class Hatake extends Ninja implements Sharingan, anbu{
    public void boasVindas (){
        System.out.println("Eu sou " + nome + " e sou um Hatake!");
    }

    public Hatake(){
        super();
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void ativarSharingan() {
        System.out.println("Meu nome é " + nome + " e eu ativei o sharingan!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Meu nome é " + nome + " e eu sou um ninja de elite!");
    }
}
