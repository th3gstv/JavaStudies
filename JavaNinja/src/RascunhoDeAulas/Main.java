package RascunhoDeAulas;

public class Main {
    public static void main(String[] args) {


        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.habilidadeEspecial();
        Naruto.estrategiaDeBatalha();


        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.habilidadeEspecial();

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 20);
        Itachi.habilidadeEspecial();
    }
}
