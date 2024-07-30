package Collections.Ejemplos.set;

import Collections.Ejemplos.modelo.Alumno;

import static java.util.Comparator.comparing;
import java.util.*;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Cristian", 8));
        sa.add(new Alumno("Cintia", 6));
        sa.add(new Alumno("Emanuel", 9));
        sa.add(new Alumno("Anahi", 3));
        sa.add(new Alumno("Platon", 8));
        sa.add(new Alumno("Ricardo", 7));
        System.out.println(sa);

    }
}
