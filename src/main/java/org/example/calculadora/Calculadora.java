package org.example.calculadora;


import static org.example.calculadora.Calculadora.restar;
import static org.example.calculadora.Calculadora.sumar;

public class Calculadora {
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static int restar(int a, int b) {
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static double media(double a, double b){
        return a + b /2;
    }

    // TODO: Agrega nuevas operaciones aquí (multiplicación, división, etc.)


}
class Main {

    public static void main(String[] args) {
        System.out.println("Suma: " + sumar(5, 3));
        System.out.println("Resta: " + restar(5, 3));
        RedondeodeNumeros redondeodeNumeros=new RedondeodeNumeros(5.5);
        System.out.println(redondeodeNumeros.numerordondejat());
        System.out.println(potencia(5,3));
        System.out.println(media(6,4));
        System.out.println(raizCuadrada(9));
        System.out.println(raizCubica(27));
        System.out.println(calcular(27,3));
        EcuacionSegundoGrado ecuacionS = new EcuacionSegundoGrado(15, 3, 12);
        ecuacionS.resolver();
    }
}
