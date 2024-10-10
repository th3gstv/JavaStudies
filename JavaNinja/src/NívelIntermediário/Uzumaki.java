package NívelIntermediário;

public class Uzumaki extends Ninja{
    public void ModeSennin(){
        System.out.println("Meu nome é " + nome + " e eu ativei o Modo Sábio!");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uzumaki!");
    }
}
