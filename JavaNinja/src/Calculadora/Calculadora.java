package Calculadora;

public class Calculadora {
    int soma(int a, int b){
        return a + b;
    }

    int subtracao(int a, int b){
        return a - b;
    }

    int multiplicacao(int a, int b){
        return a * b;
    }

    double divisao(double a, double b){
        if (b != 0) {
            return a/b;
        }else{
            System.out.println("Não é possível dividir por 0!");
            return 0;
        }
    }
}
