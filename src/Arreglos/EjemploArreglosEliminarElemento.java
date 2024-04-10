package Arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {

    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa el valor "+(i+1));
            a[i] = leer.nextInt();
        }

        System.out.println();

        System.out.println("Ingrese una posicion a eliminar entre 0 y 9: ");
        int posicion = leer.nextInt();

        // Es i -1 porque el ultimo elemento lo dejamos en i + 1
        for (int i = posicion; i < a.length-1; i++) {
            a[i] = a[i+1];
        }

        // Arreglo b con los datos de a con length =1
        int[] b = new int[a.length -1];
        System.arraycopy(a, 0, b, 0, b.length);

        a = b;

        System.out.println("El arreglo es: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("[ "+ i + " ] => [ "+a[i]+" ]");
        }
    }
}
