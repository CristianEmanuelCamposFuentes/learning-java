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

        System.out.println("\n trabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int largo = arreglo2.length;
        for (int j = 0; j < largo; j++) {
            System.out.println("arreglo [" + j + "] = " + arreglo2[j]);
        }

        String archivo = "alguna.imagen.pdf";
        // Debo salvar la expresion para que tome el punto.
        String[] archivoArr = archivo.split("\\."); // Otra opcion es [.]
        int largo2 = archivoArr.length;
        for (int k = 0; k < largo2; k++) {
            System.out.println("arreglo [" + k + "] = " + archivoArr[k]);
        }

    }
}
