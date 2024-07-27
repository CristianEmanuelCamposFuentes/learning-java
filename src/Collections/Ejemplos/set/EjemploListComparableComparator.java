package Collections.Ejemplos.set;

import Collections.Ejemplos.modelo.Alumno;

import java.util.*;
import static java.util.Comparator.comparing;
public class EjemploListComparableComparator {
    public static void main(String[] args) {

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Cristian", 8));
        sa.add(new Alumno("Cintia", 6));
        sa.add(new Alumno("Emanuel", 9));
        sa.add(new Alumno("Anahi", 3));
        sa.add(new Alumno("Platon", 8));
        sa.add(new Alumno("Ricardo", 7));
//        Collections.sort(sa, (a,b) -> a.getNombre().compareTo(b.getNombre()));
        sa.sort(comparing((Alumno ::getNombre)).reversed());
        System.out.println(sa);
//        Iterando con Stream foreach
        sa.forEach(System.out::println);
    }
}
