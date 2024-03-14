package Strings;

public class EjemploStringValidar {

    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        if(esNulo){
            curso = "Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        if(curso.isEmpty() == false){
            System.out.println(curso.toUpperCase());
            // Con concat falla si es null el argumento
            System.out.println("Bienvenido al curso de ".concat(curso));
        }

    }
}
