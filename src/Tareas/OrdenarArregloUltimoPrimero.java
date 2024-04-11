package Tareas;

import java.util.Scanner;

public class OrdenarArregloUltimoPrimero {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, arreglo[] = new int[10];
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese el valor de la posicion " + i);
            arreglo[i] = leer.nextInt();
        }
        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones,
        System.out.println("El resultado es: ");
        for (int j = 0; j < 4; j++) {
            System.out.println(arreglo[arreglo.length - 1 - j]);
            System.out.println(arreglo[j]);
        }
    }
}
