package Collections.Ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicados2 {

    public static void main(String[] args) {

        String[] peces = {"Atun", "Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Robalo"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println("Elementos unicos: " + unicos);
        System.out.println("Elementos duplicados: " + duplicados);
    }
}
