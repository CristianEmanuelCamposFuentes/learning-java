package Strings;

public class EjemploStringMetodos {

    public static void main(String[] args) {
        String nombre = "Cristian";

        // Largo
        System.out.println("nombre.length() = " + nombre.length());

        // Mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Inicia con
        System.out.println("nombre.startsWith(\"C\") = " + nombre.startsWith("C"));

        // Termina con
        System.out.println("nombre.endsWith(\"ian\") = " + nombre.endsWith("ian"));

        // Comparar Strings por valor
        System.out.println("nombre.equals(\"Cristian\") = " + nombre.equals("Cristian"));

        // Comparar Strings por valor ignorando mayusculas y minusculas
        System.out.println("nombre.equalsIgnoreCase(\"cristian\") = " + nombre.equalsIgnoreCase("Cristian"));

        // Comparar por referencia
        String nombre2 = new String("Cristian");
        System.out.println("nombre == nombre2 = " + (nombre == nombre2));
        System.out.println("nombre.equals(nombre2) = " + (nombre.equals(nombre2)));

        // Substring con un solo argumento devuelve la cadena completa desde el indice indicado
        System.out.println("nombre.substring(3) = " + nombre.substring(3));

        // Substring con dos argumentos devuelve la cadena desde el indice indicado hasta el indice indicado sin incluirlo
        System.out.println("nombre.substring(0, 3) = " + nombre.substring(0, 3));

        // Substring para obtener el ultimo caracter
        System.out.println(" Ultimo caracter (-1) = " + nombre.substring(nombre.length() - 1));

        // Metodos que retornan un string nuevo sin modificar el original
        String trabalenguas = "Trabalenguas";

        System.out.println("trabalenguas.replace(\"a\", \"o\") = " + trabalenguas.replace("a", "o"));
        System.out.println("trabalenguas.replaceFirst(\"a\", \"o\") = " + trabalenguas.replaceFirst("a", "o"));
        System.out.println("trabalenguas.indexOf(\"g\") = " + trabalenguas.indexOf("g"));
        // Si no encuentra retorna -1
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));

        // Contains (acepta cadenas, no char)
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));

        // StartsWith (acepta cadenas, no char). Es case sensitive
        System.out.println("trabalenguas.startsWith(\"Trabalenguas\") = " + trabalenguas.startsWith("t"));

        // EndsWith (acepta cadenas, no char). Es case sensitive
        System.out.println("trabalenguas.endsWith(\"Trabalenguas\") = " + trabalenguas.endsWith("S"));

        // Trim elimina los espacios en blanco al principio y final de la cadena
        trabalenguas = "   Trabalenguas   ";
        System.out.println("Trabalenguas.trim() = " + trabalenguas.trim());
        System.out.println(trabalenguas);
    }
}
