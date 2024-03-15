package Strings;

public class EjemploStringMetodosArreglo {

    public static void main(String[] args) {
        String trabalenguas = "Trabalenguas";

        System.out.println("trabalenguas.length() = " + trabalenguas.length());
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        // Convertirlo en un arreglo de elementos de tipo char
        char[] arreglo = trabalenguas.toCharArray();

        // Imprimir el arreglo
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("arreglo [" + i + "] = " + arreglo[i]);
        }



    }
}
