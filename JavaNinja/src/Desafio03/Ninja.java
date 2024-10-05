package Desafio03;

public class Ninja {
    String nome;
    String missao;
    String nivelDificuldade;
    String statusMissao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("Nome do Ninja: " +nome + "\nIdade: " +idade);
        System.out.println("Missão: " +missao + "\nNível de Dificuldade: " + nivelDificuldade + "\nStatus: " +statusMissao);
    }
}
