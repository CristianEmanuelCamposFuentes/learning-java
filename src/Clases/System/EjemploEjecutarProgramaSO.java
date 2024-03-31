package Clases.System;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {
        // El Runtime nos permite ejecutar aplicaciones con el metodo exec
        Runtime rt = Runtime.getRuntime();
        // Esto retorna un objeto de tipo Process
        Process proceso;


            try {
                if(System.getProperty("os.name").startsWith("Windows")) {
                    // Ejecutamos el programa en Windows
                    proceso = rt.exec("notepad");
                } else if(System.getProperty("os.name").startsWith("Mac")) {
                    proceso = rt.exec("textedit");
                } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").toLowerCase().contains("nix" )) {
                    proceso = rt.exec("gedit");
                } else {
                    proceso = rt.exec("gedit");
                }
                proceso.waitFor();
            } catch (Exception e) {
                System.err.println("El comando es desconocido: " + e.getMessage());
                System.exit(1);
            }
            System.out.println("Programa terminado");
            System.exit(0);
    }
}
