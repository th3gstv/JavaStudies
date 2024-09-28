package Básico;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Criação do array
        //Arrays são tipo referência
         String[] ninja = new String[5];

         //Index (Sempre se inicia no 0)
         ninja[0] = "Naruto Uzumaki";
         ninja[1] = "Sasuke Uchiha";
         ninja[2] = "Sakura Haruno";
         ninja[3] = "Kakashi Hatake";
         ninja[4] = "Rock Lee";

         //Array idade
        int[] idade = new int[5];

        System.out.println(ninja);
        scanner.close();
    }
}
