package Tareas;

import java.util.Scanner;

public class TanqueGasolina {
    public static void main(String[] args) {
//        Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
//
//        La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
//
//                Si la capacidad actual es 70 litros: imprimir Estanque lleno
//
//        Si está entre 60 y menor a 70: imprimir Estanque casi lleno
//
//        Si está entre 40 y menor a 60: imprimir Estanque  3/4
//
//        Si está entre 35 y menor a 40: imprimir Medio Estanque
//
//        Si está entre 20 y menor a 35: imprimir Suficiente

//        Si está entre 1 y menor a 20: imprimir Insuficiente

        double capacidadTotal = 70, capacidadActual;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la medida actual en litros: ");
        capacidadActual = scanner.nextDouble();

       String mensaje = (capacidadActual > capacidadTotal) ? "Capacidad incorrecta, debe ser igual o menor a 70 litros" :
                (capacidadActual == capacidadTotal) ? "Estanque lleno":
                        (capacidadActual < 70 && capacidadActual >= 60) ? "Estanque casi lleno":
                        (capacidadActual < 60 && capacidadActual >= 40) ? "Estanque  3/4":
                        (capacidadActual < 40 && capacidadActual >= 35) ? "Medio Estanque ":
                        (capacidadActual < 35 && capacidadActual >= 20) ? "Suficiente":
                        (capacidadActual < 20 && capacidadActual >= 1) ? "Insuficiente": "Ingrese una cantidad correcta.";

        System.out.println(mensaje);

    }
}
