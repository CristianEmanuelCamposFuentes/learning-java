import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
//        String numeroString = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroString);
        } catch (InputMismatchException e) {
            System.out.println("El valor introducido no es un numero entero");
            // Ejecutar nuevamente el main
            main(args);
            // Salir del programa
            System.exit(0);
        }

        System.out.println("Numero decimal: " + numeroDecimal);

        // Convertir a binario
        String mensajeBinario = "Numero binario de " + numeroDecimal + " es: " + Integer.toBinaryString(numeroDecimal);
//        int numeroBinario = 0b111110100;
//        System.out.println(numeroBinario);

        // Convertir a octal
        String mensajeOctal = "Numero octal de " + numeroDecimal + " es: " + Integer.toOctalString(numeroDecimal);
//        int numeroOctal = 036;
//        System.out.println("Numero octal: " + numeroOctal);

        // Convertir a hexadecimal
        String mensajeHexadecimal = "Numero hexadecimal de: " + numeroDecimal + " es: " + Integer.toHexString(numeroDecimal);
//        int numeroHexadecimal = 0x1e;
//        System.out.println("Numero hexadecimal: " + numeroHexadecimal);

        String mensaje = mensajeBinario;
        mensaje = mensaje + "\n" + mensajeOctal;
        mensaje = mensaje + "\n" + mensajeHexadecimal;

        System.out.println(mensaje);
    }
}
