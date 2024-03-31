package Strings;

public class EjemploStringValidar {

    public static void main(String[] args) {
        String curso = " ";

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        // Valida si esta vacio o solo contiene espacios en blanco
        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        if(curso.isEmpty() == false){
            System.out.println(curso.toUpperCase());
            // Con concat falla si es null el argumento
            System.out.println("Bienvenido al curso de ".concat(curso));
        }

    }
}
