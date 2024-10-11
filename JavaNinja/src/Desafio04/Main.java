package Desafio04;

public class Main {
    public static void main(String[] args) {
        //Ninja Básico
        NinjaBasico Hashirama = new NinjaBasico("Hashirama Senju", "Konohagakure","Moküton - Estilo Madeira",50, tipoHabilidade.KEKKEIGENKAI);
        Hashirama.mostrarInformacoes();
        Hashirama.executarHabilidade();

        System.out.println("===============");

        //Ninja Avançado
        NinjaAvançado Madara = new NinjaAvançado("Madara Uchiha", "Konohagakure", "Sharingan", 49, "Susano'o", tipoHabilidade.DOUJUTSU);
        Madara.mostrarInformacoes();
        Madara.executarEspecialidade();

    }
}
