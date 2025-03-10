package org.example.calculadora; /**
 * Programa en Java que cuenta las palabras en una frase ingresada por el usuario.
 * Incluye métodos para limpiar la entrada y contar palabras correctamente.
 */
import java.util.Scanner;

public class ContadorPalabras {

    /**
     * Método que cuenta las palabras en una cadena de texto.
     * Se considera que las palabras están separadas por espacios.
     *
     * @param frase La frase de la que se contarán las palabras.
     * @return El número de palabras en la frase.
     */
    public static int contarPalabras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0; // Si la frase está vacía, devuelve 0 palabras
        }
        String[] palabras = frase.trim().split("\\s+");
        return palabras.length;
    }

    /**
     * Método principal donde se ejecuta el programa.
     * Solicita una frase al usuario y muestra el número de palabras.
     *
     * @param args Argumentos de línea de comandos (no usados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();
        
        int numeroPalabras = contarPalabras(frase);
        System.out.println("Número de palabras en la frase: " + numeroPalabras);
        
        scanner.close();
    }
}
