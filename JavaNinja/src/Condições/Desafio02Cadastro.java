package Condições;
import java.util.Scanner;

public class Desafio02Cadastro {
    public static void main(String[] args) {
        //Criação do Scanner
        Scanner scanner = new Scanner(System.in);

        //Criação do Array
        int numeroMaximo = 5;
        String[] ninjas = new String[numeroMaximo];

        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 4) {
            //Menu
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Deletar Ninja");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numeroMaximo) {
                        System.out.println("Digite o nome do ninja: ");
                        String nomeDoNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeDoNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("O limite de ninjas já foi excedido! Não foi possível cadastrar esse ninja");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado.");
                    } else {
                        System.out.println("========== Lista de Ninjas ==========");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite o número do ninja que deseja remover: ");
                    int indexParaRemover = scanner.nextInt() - 1;
                    if (indexParaRemover >= 0 && indexParaRemover < ninjasCadastrados){
                        for (int i = indexParaRemover; i < ninjasCadastrados - 1; i++) {
                            ninjas[i] = ninjas[i + 1];
                        }
                        ninjas[ninjasCadastrados - 1] = null;
                        ninjasCadastrados--;
                        System.out.println("Ninja removido com sucesso!");
                    }else{
                        System.out.println("Número inválido! Tente novamente.");
                    }
                    break;
                case 4:
                    System.out.println("Você está deixando a área de cadastro, até logo!");
                    break;
                default:
                    System.out.println("Selecione uma opção válida!");
                    break;
            }
        }
    }
}
