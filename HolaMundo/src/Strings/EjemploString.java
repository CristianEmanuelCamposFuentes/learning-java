package Strings;

public class EjemploString {

    public static void main(String[] args) {
        String curso = "Programación Java";
        System.out.println("Hola "+curso);
        // En Java, String parece un primitivo, pero es un tipo especial de objeto
        String curso2 = new String("Programación Java");
        System.out.println("Hola "+curso2);

        boolean esIgual = (curso == curso2);
        System.out.println("Comparacion por objeto: " + esIgual);
        System.out.println("Comparacion por valor: " + curso.equals(curso2));

        // Esto va a dar true porque Java reconoce que ya existe un objeto con ese valor , entonces
        // no lo crea de nuevo, sino que usa esa instancia para optimizar la ejecución, por lo que se recomienda
        // utilizar siempre .equals() en vez de ==
        String curso3 = "Programación Java";
        esIgual = (curso == curso3);
        System.out.println("Comparacion por objeto ya existente: " + esIgual);
    }
}
