package Arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco SSD 1 TB", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta Oxford"};

        // Ordenar alfabeticamente los productos
        Arrays.sort(productos);

        // Usando For
        System.out.println("=== Usando For ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

        //Usando Foreach

        System.out.println("=== Usando Foreach ===");
        for (String producto : productos) {
            System.out.println("Producto: " + producto);
        }

        // Usando While
        System.out.println("=== Usando While ===");
        int i = 0;
        while (i < productos.length) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
            i++;
        }

        // Usando Do While
        System.out.println("=== Usando Do While ===");
        int j = 0;
        do {
            System.out.println("Producto " + (j + 1) + ": " + productos[j]);
            j++;
        } while (j < productos.length);

        // Ejemplo con numeros
        System.out.println("=== Ejemplo con números ===");
        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        // Primer For para asignar valores
        for (int k = 0; k < totalNumeros; k++) {
            numeros[k] = (k + 1) * 3;
        }

        // Segundo For para mostrar los valores
        for (int k = 0; k < totalNumeros; k++) {
            System.out.println("Número " + (k + 1) + ": " + numeros[k]);
        }
    }
}
