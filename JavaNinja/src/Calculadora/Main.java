package Calculadora;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();


        System.out.println("Soma: "+ calculadora.soma(1,25));
        System.out.println("Subtração: "+ calculadora.subtracao(20,70));
        System.out.println("Multiplicação: "+ calculadora.multiplicacao(3,9));
        System.out.println("Divisão: "+ calculadora.divisao(30,10));
    }
}
