package Condições;

public class LaçosDoWhile {
    public static void main(String[] args) {
        // Usando o laço for para treinar 5x ao dia
        int treinosDoDia = 5;

        for (int i = 0; i <= treinosDoDia; i++) {
            System.out.println("Treino nº"  + i + " concluído!");
        }

        // Usando o laço do-while para simular o controle de energia durante o treino
        int energia = 100;
        do {
            System.out.println("Energia restante: " + energia);
            energia -= 20;
        }while(energia > 0);

        System.out.println("Treinamento concluído. A energia foi utilizada de forma que você não desmaiasse!");




    }
}
