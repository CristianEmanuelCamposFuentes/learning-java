package Arreglos;

public class EjemploArreglosOrdenPrincipioFinal {

    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < numeros.length - i; i++) {
            System.out.print(numeros[i] + " ");
            System.out.println(numeros[numeros.length - 1 - i] + " ");
        }
    }
}
