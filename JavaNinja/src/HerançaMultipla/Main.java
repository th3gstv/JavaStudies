package HerançaMultipla;

public class Main {
    public static void main(String[] args) {
        //Obj uchiha
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        Sasuke.ativarSharingan();

        //Obj Hatake
        Hatake Kakashi = new Hatake("Kakashi Hatake", "Aldeia da Folha", 30);
        Kakashi.boasVindas();
        Kakashi.ativarSharingan();
        Kakashi.ninjaDeElite();
    }
}
