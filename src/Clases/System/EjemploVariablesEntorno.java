package Clases.System;

import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        // Mapear las variables de entorno
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de entorno del sistema: " + varEnv);

        System.out.println("\n ===== Listando variables de entorno del sistema: =====");
        for(String key: varEnv.keySet()) {
            System.out.println(key + " => " + varEnv.get(key));
        }

        // Ahora buscando alguna variable en particular
        String username = System.getenv("USERNAME");
        System.out.println("El nombre de usuario es: " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("La variable JAVA_HOME es: " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("La variable TEMP es: " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("La variable PATH es: " + path);

        String path2 = varEnv.get("PATH");
        System.out.println("La variable PATH es: " + path2);

        String appEnv = varEnv.get("APPLICATION_ENV");
        System.out.println("La variable APPLICATION_ENV es: " + appEnv);

        // En la command line se setean las variables de entorno con el comando setx <nombreVariable> <valorVariable>
        // Ejemplo setx SALUDAR_HOLA "Hola mundo!"
    }
}
