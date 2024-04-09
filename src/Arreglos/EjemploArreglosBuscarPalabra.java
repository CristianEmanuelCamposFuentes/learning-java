package Arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarPalabra {
    public static void main(String[] args) {
        String[] a = new String[10];
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese la palabra numero "+(i+1)+":");
            a[i] = leer.nextLine();
        }

        System.out.println("Ingresa la palabra a buscar: ");
        String nombre = leer.nextLine();
        int i = 0;

        // Mientras i sea menor que el tamanio del arreglo y a[i] sea diferente de palabra, se va incrementando en 1
        while(i < a.length && !a[i].equalsIgnoreCase(nombre)){
            i++;
        }

        if(i == a.length){
            System.out.println("La palabra no existe");
        }else if (a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0){
            System.out.println("La palabra existe, en la posicion "+(i+1));
        }

    }
}
