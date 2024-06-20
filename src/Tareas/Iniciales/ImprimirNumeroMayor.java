package Tareas.Iniciales;

import java.util.Scanner;

public class ImprimirNumeroMayor {

    public static void main(String[] args) {
//        Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99), por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.

        Scanner leer = new Scanner(System.in);
        int arreglo[] = new int[10];

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el valor de la posicion " + i + ": (entre 11 y 99)");
            arreglo[i] = leer.nextInt();
        }

        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        System.out.println("El mayor del arreglo es: " + mayor);

    }
}
