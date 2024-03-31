package ClasesWrapper;

public class WrapperOperadoresRelacionales {

    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(128);
        Integer num2 = num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Compara por referencia de objeto
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 128;

        //Compara por referencia de objeto
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        //Compara por valor
        System.out.println("Son el mismo valor? " + (num1.equals(num2)));

        //Compara por valor de los primitivos mayores o iguales que 128
        System.out.println("Son el mismo valor? " + (num1.intValue() == num2.intValue()));


        // Autoboxing es cuando empaquetamos una variable de tipo primitivo en una variable de tipo objeto
        // Autounboxing es cuando desempaquetamos una variable de tipo objeto en una variable de tipo primitivo
        // Esto se puede hacer porque la clase Integer es una subclase de la clase Number
        num2 = 10;
        boolean condicion = num1 > num2;
        System.out.println("condicion = " + condicion);

        // Esto es lo mismo que
        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("condicion2 = " + condicion2);
    }
}
