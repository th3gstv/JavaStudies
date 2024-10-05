package NívelBásico.Arrays;

public class Array2D {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];
        //Visualizar o Array 2D como uma matriz
        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Kirigakure";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Amegakure";
        ninjasEAldeias[2][1] = "Yahiko";
        ninjasEAldeias[2][2] = "Konan";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0]);
            for (int j = 1; j < ninjasEAldeias[i].length; j++) {
                System.out.println("Ninja: " + ninjasEAldeias[i][j]);
            }
        }
    }
}
