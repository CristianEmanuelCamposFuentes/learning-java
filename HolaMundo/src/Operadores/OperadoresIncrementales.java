package Operadores;

public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Pre incremento
        System.out.println("Pre incremento");
        int i = 1;
        int j = ++i; //  i = i + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        System.out.println("Post incremento");
        i = 2;
        j = i++; //  k = k + 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        System.out.println("Pre decremento");
        i = 3;
        j = --i; //  i = i - 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        System.out.println("Post decremento");
        i = 4;
        j = i--; //  k = k - 1;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("Incrementa j actual (4) y despues la asigna : " +(++j) );
        System.out.println("Asigna la j actual (5), la imprime y despues le incrementa (6) : " + (j++) );
        System.out.println("Resultado de j final: " + j );
    }
}
