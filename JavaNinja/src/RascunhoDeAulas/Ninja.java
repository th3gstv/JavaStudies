package RascunhoDeAulas;

public abstract class Ninja implements estrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;

    public Ninja(){

    };
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Metodo geral
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é a minha estratégia de combate");
    }
}
