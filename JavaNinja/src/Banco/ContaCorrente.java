package Banco;

import java.util.Scanner;

public class ContaCorrente extends Main{
    String nome;
    int saldoCorrente;

    void saldo(){
        System.out.println("Saldo: " + saldoCorrente);
    }
    Scanner scanner = new Scanner(System.in);

    void menu(){
        int contador = 0;
        int saldoSaque;
        int saldoDeposito;
        System.out.println("===== CONTA CORRENTE =====");
        System.out.println("1. Realizar saque");
        System.out.println("2. Realizar depósito");
        System.out.println("3. Visualizar o saldo");
        System.out.println("4. Sair");
        contador = scanner.nextInt();
        scanner.nextLine();


        do{
        switch (contador){
            case 1:
                System.out.println("Saldo: R$" + saldoCorrente);
                System.out.println("Insira a quantia desejada para saque: ");
                saldoSaque = scanner.nextInt();
                int saldo2 = saldoCorrente - saldoSaque;
                System.out.println("Saldo atual: R$" + saldo2);
                break;
            case 2:
                System.out.println("Insira quanto você deseja inserir: ");
                saldoDeposito = scanner.nextInt();
                saldoCorrente += saldoDeposito;
                break;
            case 3:
                System.out.println("Saldo: R$" +saldoCorrente);
                break;
            case 4:
                System.out.println("Você está deixando a área do banco!");
                break;
            default:
                System.out.println("Insira uma opção válida");
                break;}
        }while (contador != 4);
    }
}
