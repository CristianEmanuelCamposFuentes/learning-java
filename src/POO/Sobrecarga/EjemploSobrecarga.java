package POO.Sobrecarga;
import static POO.Sobrecarga.Calculadora.*;
public class EjemploSobrecarga {

    public static void main(String[] args) {
        System.out.println("Sumar 2 enteros: " + sumar(1, 2));
        System.out.println("Sumar 2 enteros: " + sumar(1, 2, 3));
        System.out.println("Sumar 2 doubles: " + sumar(1.2, 2.0));
        System.out.println("Sumar 2 doubles: " + sumar(1.3, 2.3));
        System.out.println("Sumar dos flotantes: " + sumar(3.4f, 5.6f));
        System.out.println("Sumar strings: " + sumar("Hola ", "Mundo"));
        System.out.println("Sumar longs: " + sumar(3L, 5L));

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sumar array de enteros: " + sumar(array));
    }
}
