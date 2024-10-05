package Desafio03;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: " +nome + "\nIdade: " +idade);
        System.out.println("Missão: " +missao + "\nNível de Dificuldade: " + nivelDificuldade + "\nStatus: " +statusMissao);
        System.out.println("Habilidade Especial Uchiha");
    }
}
