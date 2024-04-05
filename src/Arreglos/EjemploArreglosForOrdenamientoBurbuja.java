package Arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenamientoBurbuja {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;

        for(int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            // Invertir valores
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }

    public static void  sortBurbuja(Object[] arreglo) {
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total- 1; i++) {

            for (int j = 0; j < total - 1 - i; j++) {
                if ( ((Comparable) arreglo[j + 1]).compareTo(arreglo[j]) < 0) {
                    Object aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }
        System.out.println("Total de comparaciones: " + contador);
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco SSD 1 TB", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta Oxford"};

        int total = productos.length;

        sortBurbuja(productos);
        //Arrays.sort(productos);
        //arregloInverso(productos);

        // Tambien se puede utilizar el api Collections.reverse para obtener el mismo resultado
        //Collections.reverse(Arrays.asList(productos));

        // Usando For
        System.out.println("=== Usando For ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }


        Integer[] numeros = new Integer[4];
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = 30;
        numeros[3] = -1;

        sortBurbuja((numeros));
        System.out.println("=== Usando For con enteros ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero " + (i + 1) + ": " + numeros[i]);
        }
    }
}
