package Clases.System;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class EjemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("C:\\Users\\crist\\IdeaProjects\\spring-projects\\java-spring-boot-from-zero\\HolaMundo\\src\\config.properties");
            // Se debe agregar a un objeto properties
            // Le agregamos las config del sistema
            Properties p = new Properties(System.getProperties());

            // Agregamos las propiedades del archivo
            p.load(archivo);
            // Agregar una propiedad
            p.setProperty("mi.propiedad.personalizada", "mi valor guardado en el archivo");
            // Asignar la propiedad creada al sistema
            System.setProperties(p);
            Properties ps =System.getProperties();
            System.out.println("ps.get = " + ps.get("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

            // Cerramos el archivo
            archivo.close();

            ps.list(System.out);

        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
