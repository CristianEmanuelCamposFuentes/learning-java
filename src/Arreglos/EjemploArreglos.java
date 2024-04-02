package Arreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco SSD 1 TB", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta Oxford"};

        // Ordenar alfabeticamente los productos
        Arrays.sort(productos);

        for (String producto : productos) {
            System.out.println(producto);
        }

        int[] numeros = {44, 8, 151, 16, 23, 42};
        Arrays.sort(numeros);
        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
