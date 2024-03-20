package Operadores;

import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4;

        int suma = i + j;
        System.out.println("Suma: " + suma);
        int resta = i - j;
        System.out.println("Resta: " + resta);
        int multiplicacion = i * j;
        System.out.println("Multiplicacion: " + multiplicacion);
        // En este caso, las variables se deben castear para que den los valores decimales correctos
        float division = (float)i / (float) j;
        System.out.println("Division: " + division);
        // El resto o modulo es el residuo de la división, es decir, el resto de la división entera
        int residuo = i % j;
        System.out.println("Residuo: " + residuo);

        // El resto funciona mucho para encontrar la paridad de un numero
        int residuo2 = 8%3;
        System.out.println("Residuo2: " + residuo2);

        // Ejemplo encontrar numero par o impar
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es par");
        } else {
            System.out.println("El numero " + numero + " es impar");
        }

    }
}
