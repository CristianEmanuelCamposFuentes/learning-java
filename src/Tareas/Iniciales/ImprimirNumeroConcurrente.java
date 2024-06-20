package Tareas.Iniciales;

import java.util.Scanner;

public class ImprimirNumeroConcurrente {

    public static void main(String[] args) {
        // Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.
        Scanner leer = new Scanner(System.in);
        int[] arreglo = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor de la posicion " + i);
            arreglo[i] = leer.nextInt();
        }
        // creamos un segundo arreglo llamado arregloCantidadValores (de igual largo)
        // para guardar las cantidades de veces que se repite cada elemento
        // del arreglo principal
        int[] arregloCantidadValores = new int[10];

        // luego llenamos este segundo arreglo con las cantidades de ocurrencia
        // de los elementos del primer arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
        }

        // luego obtenemos el valor de la mayor ocurrencia (mas veces repetido)
        // y el indice o posicion para obtener el numero mas repetido
        int indice = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
        int max = 0; // la cantidad mayor de veces (la mayor ocurrencia)
        for (int i = 0; i < 10; i++) {
            if (max < arregloCantidadValores[i]) {
                max = arregloCantidadValores[i];
                indice = i;
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arreglo[indice]);
        System.out.println("el elemento " + arreglo[indice] + " esta repetido " + max + "veces!");
    }
}
