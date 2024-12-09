package RascunhoDeAulas;

public class Uchiha extends Ninja{
    public Uchiha(){
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é "+ nome+ " e esse é o meu ataque Uchiha!");
    }
}
