package Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0, ciencias = 0.0, historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la nota de Matematicas: ");
        matematicas = scanner.nextDouble();

        System.out.println("Ingresa la nota de Ciencias: ");
        ciencias = scanner.nextDouble();

        System.out.println("Ingresa la nota de Historia: ");
        historia = scanner.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        estado = promedio >= 4.50 ? "Aprobado" : "Reprobado";
        System.out.println("El promedio es: " + promedio + " y el estado es: " + estado);

    }
}
