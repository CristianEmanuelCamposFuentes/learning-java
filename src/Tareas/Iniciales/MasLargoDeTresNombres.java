package Tareas.Iniciales;

import javax.swing.*;

public class MasLargoDeTresNombres {
    public static void main(String[] args) {
/*
        Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

        Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

                Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

        Restricción no usar loops en el desarrollo de la tarea.

        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."

Declarar un arreglo
*/

        String[] nombres = new String[3];
        // Ingreso de nombres
        nombres[0] = JOptionPane.showInputDialog("Ingrese el primer nombre completo (nombre + apellido): ");
        nombres[1] = JOptionPane.showInputDialog("Ingrese el segundo nombre completo (nombre + apellido): ");
        nombres[2] = JOptionPane.showInputDialog("Ingrese el tercer nombre completo (nombre + apellido): ");
        //Comparar el nombre mas largo
        String nombreMasLargo = nombres[0];
        nombreMasLargo = (nombreMasLargo.length() > nombres[1].length()) ? nombreMasLargo : nombres[1];
        nombreMasLargo = (nombreMasLargo.length() > nombres[2].length()) ? nombreMasLargo : nombres[2];
        //Imprimir el nombre mas largo
        System.out.println("El nombre mas largo es: " + nombreMasLargo + ". Este posee " + nombreMasLargo.length() + " caracteres.");
    }
}
