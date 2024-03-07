public class PrimitivosFloat {
    // Para que una variable estatica sea accesible desde la clase, la declaramos como static, no va a tener un valor de instancia, pero si va a estar definida en la clase
    static float varFlotante;
    public static void main(String[] args) {

        // Correr coma a la izquierda
        float realFloat = 2.12e-3f;
        System.out.println(realFloat);
        System.out.println("Float corresponde en byte a " + Float.BYTES + " bytes");
        System.out.println("Float corresponde en byte a " + Float.SIZE + " bits");
        System.out.println("Maximo valor Float: " + Float.MAX_VALUE);
        System.out.println("Minimo valor Float: " + Float.MIN_VALUE);

        // Correr coma a la derecha
        float realFloat2 = 2.12e3f;
        System.out.println(realFloat2);

        double realDouble = 3.4028235e39;
        System.out.println(realDouble);
        System.out.println("Double corresponde en byte a " + Double.BYTES + " bytes");
        System.out.println("Double corresponde en byte a " + Double.SIZE + " bits");
        System.out.println("Maximo valor Double: " + Double.MAX_VALUE);
        System.out.println("Minimo valor Double: " + Double.MIN_VALUE);


        System.out.println(varFlotante);
    }
}
