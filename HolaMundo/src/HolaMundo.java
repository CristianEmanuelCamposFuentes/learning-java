public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Cristian Emanuel Campos Fuentes!");

        int numeroPar = 2;
        System.out.println("El numero par es: " + numeroPar);

        int numeroImpar = 1;
        System.out.println("El numero impar es: " + numeroImpar);

        boolean esPar = true;

        if (esPar) {
            System.out.println("El numero es par: " + numeroPar);
        } else {
            System.out.println("El numero es impar: " + numeroImpar);
        }

        // Para tipado dinamico se utiliza var
        var edadNum = 31;
        System.out.println("La edad es: " + edadNum);

        var nombre = "Cristian";
        System.out.println("El nombre es: " + nombre);

    }
}