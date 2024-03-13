package Strings;

public class EjemploStringConcatenacion {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Cristian Campos";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 20;
        String suma = "La suma de " + numeroA + " y " + numeroB + " es: " + (numeroA + numeroB);
        System.out.println(suma);
    }
}
