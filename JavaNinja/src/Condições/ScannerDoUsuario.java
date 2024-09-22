package Condições;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         *Scanner - É um jeito de trazer o usuario para dentro da aplicação
         * Objetivo: O usuário vai criar um ninja e vamos validar os dados
        */

        //Abrir o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }


}
