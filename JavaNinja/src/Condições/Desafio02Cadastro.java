package Condições;
import java.util.Scanner;

public class Desafio02Cadastro {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("\n==== Menu Ninja ====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.println("Escolha uma opção: ");

        //Criação do array
        String[] ninja = new String[0];

        //Escolhendo a opção
        int escolhaMenu = caixaDeTexto.nextInt();
        String nomeDoNinja = caixaDeTexto.nextLine();

       switch (escolhaMenu){
           case 2:
               System.out.println("Aqui estão os ninjas cadastrados atualmente: ");
               break;
           case 3:
               System.out.println("Você está deixando o sistema de cadastro. Até logo!");
       }

       if (escolhaMenu == 1){
               System.out.println("Você escolheu criar um ninja!");
               //Criação do Ninja
               System.out.println("Nome do ninja: " +nomeDoNinja);
       }


        caixaDeTexto.close();
    }
}
