package Arreglos;

import java.util.Scanner;

public class EjemploArreglosNumeroMayor {
    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < a.length; i++){
            System.out.println("Ingresa un numero");
            a[i] = s.nextInt();
        }

        int max = 0;

        for(int i = 1; i < a.length; i++){
            // Ternario para consultar maximo
            max = (a[ max] > a[i]) ?  max : i;
        }

        System.out.println("El numero mayor es: " + a[max]);
    }
}
