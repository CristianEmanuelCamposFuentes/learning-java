package Operadores;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();
        // Evalua primero si num1 es el mayor y lo asigna
        max = (num1 > num2 && num1 > num3) ? num1 :
                // Si no, evalua si num2 es el mayor y lo asigna
                ((num2 > num3) ? num2 :
                        // Si no, num3 es el mayor
                        num3);
        System.out.println("El mayor de los tres es: " + max);
    }
}
