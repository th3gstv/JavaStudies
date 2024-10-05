package NívelBásico;
import java.util.Scanner;

public class Rascunho {
    public static void main(String[] args) {
        //Criação do Scanner
        Scanner scanner = new Scanner(System.in);

        //Criação do Array
        int numeroMaximo = 5;
        String[] ninjas = new String[numeroMaximo];

        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while(opcao !=3) {
            //Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    if(ninjasCadastrados<numeroMaximo){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeDoNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    }else{
                        System.out.println("O limite de ninjas já foi excedido! Não foi possível cadastrar esse ninja");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja encontrado.");
                    }else{
                        System.out.println("========== Lista de Ninjas ==========");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }break;
                case 3:
                    System.out.println("Você está deixando a área de cadastro, até logo!");
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
                    break;
            }
        }
    }
}
