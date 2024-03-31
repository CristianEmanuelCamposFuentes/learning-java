package Clases.System;

import java.util.Properties;

public class EjemploPropiedadesSistema {

    public static void main(String[] args) {
        String username = System.getProperty("user.name");
        String userdir = System.getProperty("user.dir");
        String home = System.getProperty("user.home");
        System.out.println("El nombre de usuario es: " + username);
        System.out.println("El directorio actual es: " + (userdir));
        System.out.println("El directorio de inicio es: " + (home));

        String javaVersion = System.getProperty("java.version");
        System.out.println("La version de Java es: " + javaVersion);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("El separador de lineas es: " + lineSeparator + "LINEA NUEVA");

        String lineSeparator2 = System.lineSeparator();
        System.out.println("El metodo separador de lineas es: " + lineSeparator2 + "LINEA NUEVA");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
