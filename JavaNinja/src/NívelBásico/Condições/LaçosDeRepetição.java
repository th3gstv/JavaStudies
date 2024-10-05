package NívelBásico.Condições;

public class LaçosDeRepetição {
    public static void main(String[] args) {
        /*
        *Laços de Repetição: Vão repetir infinitamente ou até chegar no parâmetro desejado
        * While = For
         */

        //While
        //While (condição) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*
        while (numeroDeClones < numeroMaximoDeClones){
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }
        */

        //FOR
        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto está se clonando e já se clonou " + i);
        }
    }
}
