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

         //Redeclarando o array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[5]);
        //System.out.println(ninja); //Garbage Collection

        //LOOP para recorrer ao away
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }
        scanner.close();
    }
}
