package Tareas;

import java.util.Scanner;

public class Histograma {

    public static void main(String[] args) {
        // Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
        //
        //El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
        //
        //Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6, incluso si no están presente en el arreglo.
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce un valor entre 1 y 6: ");
            array[i] = scanner.nextInt();
        }
        // Crear segundo arreglo String para agregar la cantidad de veces que se repite cada numero
        String[] arrayHistograma = new String[6];
        for (int i = 0; i < arrayHistograma.length; i++) {
            int aux = i + 1;
            String histograma = aux + ": ";

            for (int j = 0; j < array.length; j++) {
                if (array[j] == aux) {
                    histograma += "*";
                }
            }
            arrayHistograma[i] = histograma;
        }

        // Mostrar el histograma
        for (int i = 0; i < arrayHistograma.length; i++) {
            System.out.println(arrayHistograma[i]);
        }
    }
}
