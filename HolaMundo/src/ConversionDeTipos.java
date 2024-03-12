public class ConversionDeTipos {

    public static void main(String[] args) {

        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("Numero entero: " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("Real: " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("Logico: " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("Numero entero: " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("Numero string: " + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("Numero string: " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("Real string: " + otroRealStr);

        otroRealStr = String.valueOf(otroRealDouble);
        System.out.println("Real string: " + otroRealStr);

        // Conversion de enteros a short con cast
        int i = 15000;
        short s = (short) i;
        System.out.println("Short: " + s);
        System.out.println(Short.MAX_VALUE);
        long l = (long) i;
        System.out.println("Long: " + l);
        float f = (float) i;
        System.out.println("Float: " + f);
        char c = (char) i;
        System.out.println("Double: " + c);


    }
}
