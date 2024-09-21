package TiposDeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja.
            int: Números inteiros.
            float: Números de ponto flutuante de precisão simples.
            double: Números de ponto flutuante de precisão dupla.
            char: Um único caractere.
            boolean: Valores verdadeiros ou falsos.
            byte: Números inteiros pequenos.
            short: Números inteiros menores que um int.
            long: Números inteiros maiores que um int.
         */

        int idade = 17; //Valor maximo: 2.147.483.647
        double altura = 1.68;
        char inicial = 'S';
        boolean vivoOuMorto = true;
        Long saldoBancario = 10000L; //Valor máximo: 9.223.372.036.854.775.807

        System.out.println(altura); //sout
        System.out.println("Saldo bancário é = " + saldoBancario); //soutv
        System.out.println("Minha idade é = " + idade);
    }
}
