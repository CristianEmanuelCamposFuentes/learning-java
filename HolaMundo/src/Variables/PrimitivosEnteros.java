package Variables;

public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        short numeroShort = 12127;
        int numeroInt = 733;
        long numeroLong = 711111;
        float numeroFloat = 7.0f;
        double numeroDouble = 83399.99;
        char caracter = 'a';
        boolean verdadero = true;
        boolean falso = false;

        System.out.println(numeroByte);
        System.out.println("El tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("El tipo byte corresponde en bits a: " + Byte.SIZE);
        System.out.println("Valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        System.out.println(numeroShort);
        System.out.println("El tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("El tipo short corresponde en bits a: " + Short.SIZE);
        System.out.println("Valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short: " + Short.MIN_VALUE);

        System.out.println(numeroInt);
        System.out.println("El tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("El tipo int corresponde en bits a: " + Integer.SIZE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);

        System.out.println(numeroLong);
        System.out.println("El tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("El tipo long corresponde en bits a: " + Long.SIZE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);

        System.out.println(numeroFloat);
        System.out.println("El tipo float corresponde en byte a: " + Float.BYTES);
        System.out.println("El tipo float corresponde en bits a: " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);

        System.out.println(numeroDouble);
        System.out.println("El tipo double corresponde en byte a: " + Double.BYTES);
        System.out.println("El tipo double corresponde en bits a: " + Double.SIZE);
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE);

        System.out.println(caracter);
        System.out.println("El tipo char corresponde en byte a: " + Character.BYTES);
        System.out.println("El tipo char corresponde en bits a: " + Character.SIZE);

        System.out.println(verdadero);
        System.out.println(falso);

        // Esta caracteristica no se soporta en Java 8, va a depender del literal al final de la variable
        var numeroVar = 128;

        System.out.println(numeroVar);
    }
}
