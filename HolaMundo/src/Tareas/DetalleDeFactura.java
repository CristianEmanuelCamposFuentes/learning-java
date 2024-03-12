package Tareas;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String mensaje = "La factura por: ";
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProyecto = scanner.nextLine();
        mensaje += nombreProyecto;
        System.out.println("Ingrese el primer precio: ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el segundo precio: ");
        double precio2 = scanner.nextDouble();
        mensaje += " tiene un costo bruto total de: " + (precio + precio2);
        double impuesto = 1.19;
        mensaje += " con un impuesto de: " + impuesto;
        double total = precio + precio2 * impuesto;
        mensaje += " y un total despues de impuestos: " + total;
        System.out.println(mensaje);
    }
}
