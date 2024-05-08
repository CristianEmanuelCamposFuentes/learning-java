package POO.Sobrecarga;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        System.out.println("Sumar 2 enteros: " + calculadora.sumar(1, 2));
        System.out.println("Sumar 2 enteros: " + calculadora.sumar(1, 2, 3));
        System.out.println("Sumar 2 doubles: " + calculadora.sumar(1.2, 2.0));
        System.out.println("Sumar 2 doubles: " + calculadora.sumar(1.3, 2.3));
        System.out.println("Sumar dos flotantes: " + calculadora.sumar(3.4f, 5.6f));
        System.out.println("Sumar strings: " + calculadora.sumar("Hola ", "Mundo"));
        System.out.println("Sumar longs: " + calculadora.sumar(3L, 5L));
    }
}
