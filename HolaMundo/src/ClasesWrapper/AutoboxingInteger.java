package ClasesWrapper;

public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10};

        int suma = 0;

        // Suma de los numeros pares con unboxing
        for (Integer i: enteros){
            if (i.intValue() % 2 == 0){
                suma += i.intValue();
                System.out.println("Suma parcial: " + suma);
            }

        }
        System.out.println("La suma total es: " + suma);
    }
}
