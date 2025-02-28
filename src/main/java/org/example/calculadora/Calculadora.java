package org.example.calculadora;

public class Calculadora {
    public static int valorAbsoluto(int x) {
        return Math.abs(x);
    }

    public static void main(String[] args) {
        System.out.println("Valor absoluto: " + valorAbsoluto(-10));
    }
}
