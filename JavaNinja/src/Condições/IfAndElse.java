package Condições;

public class IfAndElse {
    public static void main(String[] args) {

        /*
        IF e ELSE - Condições
        Objetivo: Passar o ninja de nível de acordo com o número de missões
         */

        String nome = "Sasuke Uchiha";
        String rank;

        int idade = 16;
        short numeroDeMissoes = 14;


        //Com IF and Else
        /*
        if (numeroDeMissoes >= 10 && idade > 15) {
            System.out.println("Graduação: Chunnin");
        } else if (numeroDeMissoes >=20) {
            System.out.println("Graduação: Jounnin");
        }else {
            System.out.println("Graduação: Gennin");
        } */

        //Com ternários
        String graduacao = (numeroDeMissoes >= 20) ? "Graduação: Jounnin" :
                (numeroDeMissoes >= 10 && idade > 15) ? "Graduação: Chunnin": "Graduação: Gennin";


        System.out.println(graduacao);



    }
}
