package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresa el valor "+(i+1));
            a[i] = leer.nextInt();
        }

        System.out.println("Ingresa el numero a buscar");
        int num = leer.nextInt();
        int i = 0;

        // Mientras i sea menor que el tamanio del arreglo y a[i] sea diferente de numero, se va incrementando en 1
        while(i < a.length && a[i] != num){
            i++;
        }

        if(i == a.length){
            System.out.println("El numero no existe");
        }else{
            System.out.println("El numero existe, en la posicion "+(i+1));
        }
    }
}
