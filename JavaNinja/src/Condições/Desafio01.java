package Condições;

public class Desafio01 {
    public static void main(String[] args) {
        //NINJA 1
        String ninja1 = "Sasuke Uchiha";
            int idadeN1 = 14;
            String aldeiaN1 = "Konohagakure";
            String missaoN1 = "Auxiliar Iruka na formação de novos gennins";
            char rankMissaoN1 = 'D';

        System.out.println("Nome do ninja: " + ninja1);
        System.out.println("Idade do ninja: " + idadeN1);
        System.out.println("Aldeia do ninja: " + aldeiaN1);
        System.out.println("Missão: " + missaoN1);
        System.out.println("Rank da Missão: " + rankMissaoN1);

        if (rankMissaoN1 == 'D' && idadeN1 < 15){
            System.out.println("Status da Missão: Concluída");
        }else if (rankMissaoN1 == 'C' && idadeN1 < 15){
            System.out.println("Status da Missão: Concluída");
        }else if(idadeN1 >= 15) {
            System.out.println("Status da Missão: Concluída");
        }else {
            System.out.println("Status da Missão: Não concluída");
        }

        System.out.println("--------------");

        //NINJA 2
        String ninja2 = "Konohamaru Sarutobi";
            int idadeN2 = 12;
            String aldeiaN2 = "Konohagakure";
            String missaoN2 = "Conter os ninjas invasores";
            char rankMissaoN2 = 'A';

        System.out.println("Nome do ninja: " + ninja2);
        System.out.println("Idade do ninja: " + idadeN2);
        System.out.println("Aldeia do ninja: " + aldeiaN2);
        System.out.println("Missão: " + missaoN2);
        System.out.println("Rank da Missão: " + rankMissaoN2);

        if(idadeN2 < 15){
            if (rankMissaoN2 == 'D' || rankMissaoN2 == 'C'){
                System.out.println("Status da Missão: Concluída");
            }else {
                System.out.println("Status da Missão: Não concluída (Idade insufisciente)");
            }
        }else {
            System.out.println("Status da Missão: Concluída");
        }

        System.out.println("--------------");

        //NINJA 3
        String ninja3 = "Kakashi Hatake";
        int idadeN3 = 29;
        String aldeiaN3 = "Konohagakure";
        String missaoN3 = "Interceptar Invasores da Aldeia da Névoa";
        char rankMissaoN3 = 'B';

        System.out.println("Nome do ninja: " + ninja3);
        System.out.println("Idade do ninja: " + idadeN3);
        System.out.println("Aldeia do ninja: " + aldeiaN3);
        System.out.println("Missão: " + missaoN3);
        System.out.println("Rank da Missão: " + rankMissaoN3);

        //Verificar nível da missão e idade do ninja
        if (idadeN3 < 15){
            if (rankMissaoN3 == 'D' || rankMissaoN3 == 'C'){
                System.out.println("Status da Missão: Concluída");
            }else {
                System.out.println("Status da Missão: Não concluída");
            }
        }else {
            System.out.println("Status da Missão: Concluída");
        }
        System.out.println("--------------");

    }
}