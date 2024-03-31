package Strings;

public class EjemploStringExtensionArchivo {

    public static void main(String[] args) {

        String archivo = "prueba.txt";
        String extension = "";
        int indicePunto = archivo.lastIndexOf(".");
        if (indicePunto > 0 && indicePunto < archivo.length() - 1) {
            extension = archivo.substring(indicePunto + 1);
        }
        System.out.println("extension = " + extension);
    }
}
