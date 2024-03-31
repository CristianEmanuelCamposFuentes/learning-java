package Strings;

import java.util.Scanner;

public class ProgramaManejoDeNombres {

    public static void main(String[] args) {
        // La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
        //
        //Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.
        //
        //Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es
        //
        //Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer nombre: ");
        String primerNombre = scanner.nextLine();
        System.out.println("Ingrese el segundo nombre: ");
        String segundoNombre = scanner.nextLine();
        System.out.println("Ingrese el tercer nombre: ");
        String tercerNombre = scanner.nextLine();

        String nombreCompleto = "";
        String nuevoPrimerNombre = primerNombre.substring(1, 2).toUpperCase() + "." + primerNombre.substring(primerNombre.length() - 2);
        String nuevoSegundoNombre = segundoNombre.substring(1, 2).toUpperCase() + "." + segundoNombre.substring(segundoNombre.length() - 2);
        String nuevoTercerNombre = tercerNombre.substring(1, 2).toUpperCase() + "." + tercerNombre.substring(tercerNombre.length() - 2);
        System.out.println(nombreCompleto.join("_", nuevoPrimerNombre,nuevoSegundoNombre, nuevoTercerNombre) );

        scanner.close();
    }
}
