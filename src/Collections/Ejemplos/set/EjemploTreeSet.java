package Collections.Ejemplos.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {

    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");
        ts.add("tres");

        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(22);
        numeros.add(3);
        numeros.add(40);
        numeros.add(5);
        System.out.println("numeros = " + numeros);
    }
}
