package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDesplazarPosicion4 {
    public static void main(String[] args) {

        int[] a = new int[10];
        // El ultimo elemento lo vamos a guardar en una variable auxiliar para mantener el valor, vamos a reemplazar un elemento indicado por teclado su cantidad y posicion, aumentando el tamanio del arreglo
        int elemento, posicion, ultimo;
        Scanner leer = new Scanner(System.in);

        // Llenar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa el valor "+(i+1));
            a[i] = leer.nextInt();
        }

        System.out.println();
        // Nuevo elemento
        System.out.println("Ingrese el nuevo elemento: ");
        elemento = leer.nextInt();
        System.out.println("Ingrese la posicion: ");
        posicion = leer.nextInt();

        ultimo = a[a.length - 1];
        // Desde el final hacia arriba
        for (int i = a.length-2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        // Copia
        System.arraycopy(a, 0, b, 0, a.length);
        // Insertar nuevo elemento
        a = b;
        a[posicion] = elemento;
        // Copia
        a[a.length - 1] = ultimo;

        System.out.println("El arreglo es: ");
        // Mostrar el arreglo
        for (int i = 0; i < a.length; i++) {
            System.out.println("[ "+a[i]+" ]");
        }
    }
}
