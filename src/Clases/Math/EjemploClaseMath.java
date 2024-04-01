package Clases.Math;

public class EjemploClaseMath {

    public static void main(String[] args) {

        // Valor absoluto
        int absoluto = Math.abs(-10);

        System.out.println("El valor absoluto de -10 es: " + absoluto);

        absoluto = Math.abs(10);
        System.out.println("El valor absoluto de 10 es: " + absoluto);

        // Valor maximo
        double max = Math.max(10.5, 5.2);
        System.out.println("El valor maximo es: " + max);

        // Valor minimo
        double min = Math.min(10.5, 5.2);
        System.out.println("El valor minimo es: " + min);

        // Valor round redondea el numero con decimales a su parte entera
        double redondeado = Math.round(10.9);
        System.out.println("El valor redondeado es: " + redondeado);

        // Valor ceil redondea el numero hacia arriba
        double ceil = Math.ceil(10.5);
        System.out.println("El valor ceil es: " + ceil);

        // Valor floor redondea el numero hacia abajo
        double floor = Math.floor(10.5);
        System.out.println("El valor floor es: " + floor);

        // Valor random entre 0 y 1
        double random = Math.random();
        System.out.println("El valor random es: " + random);

        // Valor random entre 0 y 10
        int random2 = (int) (Math.random() * 11);
        System.out.println("El valor random entre 0 y 10 es: " + random2);

        // Funciones trigonometricas
        // Exponencial
        double exp = Math.exp(3);
        System.out.println("El valor exponencial es: " + exp);

        // Raiz cuadrada
        double sqrt = Math.sqrt(9);
        System.out.println("El valor raiz cuadrada es: " + sqrt);

        // Raiz cubica
        double cube = Math.cbrt(27);
        System.out.println("El valor raiz cubica es: " + cube);

        // Logaritmo
        double log = Math.log(10);
        System.out.println("El valor logaritmo es: " + log);

        // Radianes a grados
        double grados = Math.toDegrees(Math.PI);
        System.out.println("El valor PI en grados es: " + grados);

        // Grados a radianes
        double radianes = Math.toRadians(180);
        System.out.println("El valor radianes es: " + radianes);

        // Seno
        double seno = Math.sin(90);
        System.out.println("El valor seno de 90 grados es: " + seno);

        // Coseno
        double coseno = Math.cos(90);
        System.out.println("El valor coseno de 90 grados es: " + coseno);

        // Tangente
        double tangente = Math.tan(90);
        System.out.println("El valor tangente de 90 grados es: " + tangente);
    }
}
