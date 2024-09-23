package Condições;

public class Ternarios {
    public static void main(String[] args) {
        /*
        *Ternários: São formas de reduzir os códigos
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;

         */

        short numeroDeMissoes = 8;
        String nivel = (numeroDeMissoes >= 10 ) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivel);
    }
}
