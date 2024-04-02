package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco SSD 1 TB", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta Oxford"};

        // Ordenar alfabeticamente los productos
        Arrays.sort(productos);

        // Usando For
        System.out.println("=== Usando For ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

        // Usando For inverso 1
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (productos.length - i) + ": " + productos[i]);
        }

        // Usando For inverso 2
        System.out.println("=== Usando For inverso 2 ===");
        for (int i = productos.length - 1; i >= 0; i--) {
            System.out.println("Producto " + (productos.length - i) + ": " + productos[i]);
        }
    }
}
