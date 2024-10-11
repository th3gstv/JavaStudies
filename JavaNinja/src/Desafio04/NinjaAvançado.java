package Desafio04;

public class NinjaAvançado extends NinjaBasico implements Ninja {
    String especialidade;

    public NinjaAvançado(String nome, String vila, String habilidade, int idade, String especialidade, tipoHabilidade tipo) {
        super(nome, vila, habilidade, idade, tipo);
        this.especialidade = especialidade;
        //this.tipoHabilidade = tipoHabilidade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " +nome + "\nVila: " +vila + "\nIdade: " +idade + "\nHabilidade: " +habilidade + "\nTipo de Habilidade: " + tipo);
    }
    public void executarHabilidade(){
        System.out.println("A minha habilidade " + habilidade + " do tipo " + tipo + " foi ativada!");
    }
    public void executarEspecialidade(){
        System.out.println("Executando especialidade - " + especialidade);
    }
}
