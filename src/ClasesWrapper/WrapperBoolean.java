package ClasesWrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1 , num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; // false
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");

        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);
        System.out.println("Es lo mismo objBoolean y objBoolean2? " + (objBoolean == objBoolean2));

        // Comparando con equals
        System.out.println("Son iguales con equals? " + (objBoolean.equals(objBoolean2)));
    }
}
