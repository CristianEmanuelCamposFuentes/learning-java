package Tareas;

import java.util.Scanner;

public class DosNumerosMayorMenor {
    public static void main(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        num2 = scanner.nextInt();

        int numeroMayor = (num1 > num2) ? num1 : num2;
        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
