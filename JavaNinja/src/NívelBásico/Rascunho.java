package NívelBásico;
import java.util.Scanner;

public class Rascunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Array
        int numeroMaximo = 3;
        String[] ninjas = new String[numeroMaximo];

        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 4){
        System.out.println("\n===== Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");

        opcao = scanner.nextInt();
        scanner.nextLine();

        }



        scanner.close();
    }
}
