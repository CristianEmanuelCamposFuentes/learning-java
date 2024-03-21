package Tareas;

import java.util.Scanner;

public class MasLargoDeTresNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Declarar un arreglo
        String[] nombres = new String[3];
        // Ingreso de nombres
        for (int i=0; i<3; i++) {
            System.out.println("Escriba el nombre del usuario "+(i+1));
            nombres[i] = scanner.nextLine();
        }

        // Buscar el mas largo
        String masLargo = nombres[0];
        for (int i=1; i<3; i++) {
            if (nombres[i].length() > masLargo.length()) {
                masLargo = nombres[i];
            }
        }
        System.out.println("El nombre mas largo es "+masLargo + " y tiene "+masLargo.length()+" caracteres");
    }
}
