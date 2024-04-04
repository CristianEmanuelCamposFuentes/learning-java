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
    public static void main(String[] args) {

        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco SSD 1 TB", "Asus Notebook", "Macbook Air", "Chromecast", "Bicicleta Oxford"};

        int total = productos.length;
        int contador = 0;


// Van a ser dos For, el primero recorre cada elemento del arreglo, y el segundo los compara cada elemento con cada elemento del array
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total - 1; j++) {
                if (productos[i].compareTo(productos[j]) < 0) {
                    // El auxiliar se necesita para intercambiar valores, manteniendo el valor de la variable de iteracion
                    String aux = productos[i];
                    productos[i] = productos[j ];
                    productos[j] = aux;
                }
                contador++;
            }
        }

        System.out.println("Total de comparaciones: " + contador);
        //Arrays.sort(productos);
        //arregloInverso(productos);

        // Tambien se puede utilizar el api Collections.reverse para obtener el mismo resultado
        //Collections.reverse(Arrays.asList(productos));

        // Usando For
        System.out.println("=== Usando For ===");
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }
    }
}
