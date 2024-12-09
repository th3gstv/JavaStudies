package HerançaMultipla;

public class Uchiha extends Ninja implements Sharingan{
    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void ativarSharingan(){
        System.out.println("O meu nome é "+ nome + " e eu ativei o sharingan!");
    };
}
