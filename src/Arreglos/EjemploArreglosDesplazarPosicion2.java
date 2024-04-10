package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        // El ultimo elemento lo vamos a guardar en una variable auxiliar para mantener el valor, vamos a reemplazar un elemento indicado por teclado su cantidad y posicion
        int elemento, posicion;
        Scanner leer = new Scanner(System.in);

        // Llenar el arreglo
        for (int i = 0; i < a.length-1; i++) {
            System.out.println("Ingresa el valor "+(i+1));
            a[i] = leer.nextInt();
        }

        System.out.println();
        // Nuevo elemento
        System.out.println("Ingrese el nuevo elemento: ");
        elemento = leer.nextInt();
        System.out.println("Ingrese la posicion: ");
        posicion = leer.nextInt();

        // Desde el final hacia arriba
        for (int i = a.length-2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El arreglo es: ");
        // Mostrar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("[ "+a[i]+" ]");
        }

    }
}
