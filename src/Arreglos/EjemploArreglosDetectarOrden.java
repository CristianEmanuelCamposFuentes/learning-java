package Arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros: ");

        for (int i = 0; i < a.length; i++) {
            a[i] = lector.nextInt();
        }

        // Deteccion si es ascendente o descendente
        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                ascendente = true;
            } else {
                descendente = true;
            }
        }

        if (ascendente && descendente) {
            System.out.println("El arreglo es desordenado");
        } else if (!descendente && !ascendente) {
            System.out.println("Son todos iguales");
        } else if (ascendente && !descendente) {
            System.out.println("El arreglo esta ordenado");
        }
    }
}
