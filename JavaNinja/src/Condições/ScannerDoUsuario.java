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

        //Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber a idade do ninja
        System.out.println("Escreva aqui a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é " + idadeDoNinja + " anos.");

        //Tratamento dos dados
        if (idadeDoNinja >=18){
            System.out.println("Este ninja já possui sua maioridade, pode realizar missões fora da aldeia");
        }else {
            System.out.println("Este ninja é muito novo, precisa treinar mais para realizar missões fora da aldeia");
        };
        //Fechar sempre o Scanner
        caixaDeTexto.close();
    }


}
