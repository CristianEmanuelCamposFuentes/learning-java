package Variables;

public class PrimitivosCaracteres {

    public static void main(String[] args) {
        char myChar = '@';
        char myUnicodeChar = '\u0040';
        char decimalChar = 64;
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(decimalChar);

        System.out.println("Decimal = Caracter? " + (decimalChar == myChar));

        System.out.println("Decimal = Caracter? " + (decimalChar == myUnicodeChar));

        System.out.println("Decimal = Caracter? " + (myChar == myUnicodeChar));

        System.out.println("Char corresponde en byte = " + Character.BYTES);
        System.out.println("Char corresponde en bites = " + Character.SIZE);
        System.out.println("Minimo valor de char = " + Character.MIN_VALUE);
        System.out.println("Maximo valor de char = " + Character.MAX_VALUE);

        char espacio = '\u0020';
        System.out.println("Char espacio = " + espacio);

        char tabulador = '\t';
        System.out.println("Char tabulador = " + tabulador);

        char nuevaLinea = '\n';
        System.out.println("Char nueva linea = " + nuevaLinea);

        char retorno = '\r';
        System.out.println("Char retorno = " + retorno);

        char comilla = '\u0022';
        System.out.println("Char comilla = " + comilla);

        char backSpace = '\b';
        System.out.println("Char backspace = " + backSpace);

        char formFeed = '\u000C';
        System.out.println("Char form feed = " + formFeed);

        char nuevaPagina = '\u000B';
        System.out.println("Char nueva pagina = " + nuevaPagina);

        char nullChar = '\u0000';
        System.out.println("Char null = " + nullChar);


    }
}
