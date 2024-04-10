package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion {
    public static void main(String[] args) {

        int[] a = new int[10];
        // El ultimo elemento lo vamos a guardar en una variable auxiliar para mantener el valor, mientras vamos a desplazar todos los valores restantes hacia abajo
        int ultimo;
        Scanner leer = new Scanner(System.in);

        // Llenar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa el valor "+(i+1));
            a[i] = leer.nextInt();
        }

        System.out.println();
        ultimo = a[a.length-1];
        // Desde el final hacia arriba
        for (int i = a.length-1; i > 0; i--) {
            a[i] = a[i-1];
        }
        a[0] = ultimo;

        System.out.println("El arreglo es: ");
        // Mostrar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("[ "+a[i]+" ]");
        }

    }
}
