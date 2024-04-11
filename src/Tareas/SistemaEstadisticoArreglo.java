package Tareas;

import java.util.Scanner;

public class SistemaEstadisticoArreglo {

    public static void main(String[] args) {
        // Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, el promedio de los negativos y contar el número de ceros.
        Scanner leer = new Scanner(System.in);
        int[] arreglo = new int[7];
        int sumaPositivos = 0, sumaNegativos = 0, sumaCeros = 0, promedioPositivos = 0, promedioNegativos = 0, promedioCeros = 0;
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el valor de la posicion " + i);
            arreglo[i] = leer.nextInt();
            if (arreglo[i] > 0) {
                sumaPositivos += arreglo[i];
            } else if (arreglo[i] < 0) {
                sumaNegativos += arreglo[i];
            } else if (arreglo[i] == 0) {
                sumaCeros++;
            }
        }
        promedioPositivos = sumaPositivos / arreglo.length;
        promedioNegativos = sumaNegativos / arreglo.length;
        promedioCeros = sumaCeros;
        System.out.println("El promedio de los positivos es: " + promedioPositivos);
        System.out.println("El promedio de los negativos es: " + promedioNegativos);
        System.out.println("La cantidad de ceros es: " + promedioCeros);

    }
}
