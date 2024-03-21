package Operadores;

public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = new String("Creando un objeto de la clase String");
        System.out.println(texto instanceof String);

        Integer num = 10;
        System.out.println(num instanceof Integer);

        Boolean b1 = num instanceof  Object;
        System.out.println(b1);

        b1 = num instanceof  Number;
        System.out.println(b1);

        b1= b1 instanceof Boolean;
        System.out.println(b1);


    }
}
