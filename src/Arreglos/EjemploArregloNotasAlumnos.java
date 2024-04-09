package Arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLengua;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLengua = new double[7];

        Scanner lector = new Scanner(System.in);

        System.out.print("Dame la nota de la clase de Matematicas de los 7 estudiantes: \n");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = lector.nextDouble();
        }

        System.out.print("Dame la nota de la clase de Historia de los 7 estudiantes: \n");
        for (int j = 0; j < claseHistoria.length; j++) {
            claseHistoria[j] = lector.nextDouble();
        }

        System.out.print("Dame la nota de la clase de Lengua de los 7 años: \n");
        for (int k = 0; k < claseLengua.length; k++) {
            claseLengua[k] = lector.nextDouble();
        }

        // Promedios de los 7 Estudiantes
        double promedioMatematicas = 0, promedioHistoria = 0, promedioLengua = 0;
        for (int i = 0; i < claseMatematicas.length; i++) {
            promedioMatematicas += claseMatematicas[i];
        }
        for (int j = 0; j < claseHistoria.length; j++) {
            promedioHistoria += claseHistoria[j];
        }
        for (int k = 0; k < claseLengua.length; k++) {
            promedioLengua += claseLengua[k];
        }
        promedioMatematicas = promedioMatematicas / claseMatematicas.length;
        promedioHistoria = promedioHistoria / claseHistoria.length;
        promedioLengua = promedioLengua / claseLengua.length;

        System.out.println("El promedio de la clase de Matematicas es: " + promedioMatematicas);
        System.out.println("El promedio de la clase de Lengua es: " + promedioLengua);
        System.out.println("El promedio de la clase de Historia es: " + promedioHistoria);


        System.out.println("Ingrese el identificador del alumno que quiere saber el promedio de notas: (entre 0 y 6) \n");
        int identificador = lector.nextInt();
        System.out.println("El promedio de la clase de Matematicas del estudiante " + identificador + " es: " + claseMatematicas[identificador]);
        System.out.println("El promedio de la clase de Lengua del estudiante " + identificador + " es: " + claseLengua[identificador]);
        System.out.println("El promedio de la clase de Historia del estudiante " + identificador + " es: " + claseHistoria[identificador]);
    }
}
