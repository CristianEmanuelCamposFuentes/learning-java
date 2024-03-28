package ClasesWrapper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MetodoGetClass {

    public static void main(String[] args)  {
        String texto = "Hola que tal!";
        Class textoClass = texto.getClass();
        System.out.println("strClass: " + textoClass);
        System.out.println("strClass.getName(): " + textoClass.getName());
        System.out.println("strClass.getSimpleName(): " + textoClass.getSimpleName());
        System.out.println("strClass.getCanonicalName(): " + textoClass.getCanonicalName());
        System.out.println("strClass.getPackage(): " + textoClass.getPackage());

        // Arreglo de los Method
        for (Method metodo : textoClass.getMethods()) {
            System.out.println("metodo.getName(): " + metodo.getName() + "\n");
        }

        Integer num = 10;
        Class numClass = num.getClass();
        System.out.println("numClass: " + numClass);
        System.out.println("numClass.getName(): " + numClass.getName());
        System.out.println("numClass.getSimpleName(): " + numClass.getSimpleName());
        System.out.println("numClass.getCanonicalName(): " + numClass.getCanonicalName());
        System.out.println("numClass.getPackage(): " + numClass.getPackage());

        for(Method metodo : numClass.getMethods()) {
            System.out.println("metodo.getName(): " + metodo.getName() + "\n");
        }
    }
}
