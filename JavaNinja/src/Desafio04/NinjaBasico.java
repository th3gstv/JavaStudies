package Desafio04;

public class NinjaBasico implements Ninja{
    public String nome;
    public String vila;
    public String habilidade;
    public int idade;
    public tipoHabilidade tipo;


    public NinjaBasico(String nome, String vila, String habilidade, int idade, tipoHabilidade tipo) {
        this.nome = nome;
        this.vila = vila;
        this.habilidade = habilidade;
        this.idade = idade;
        this.tipo = tipo;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " +nome + "\nVila: " +vila + "\nIdade: " +idade + "\nHabilidade: " +habilidade + "\nTipo de Habilidade: " + tipo);
    }

    public void executarHabilidade(){
    }
}

