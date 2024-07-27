package Collections.Ejemplos.set;

import Collections.Ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Cristian", 8));
        sa.add(new Alumno("Cintia", 6));
        sa.add(new Alumno("Emanuel", 9));
        sa.add(new Alumno("Anahi", 3));
        sa.add(new Alumno("Platon", 8));
        sa.add(new Alumno("Ricardo", 7));
        Alumno p = new Alumno("Platon", 9);
        sa.add(p);
        System.out.println(sa);

//       Iterando con for
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }

//       Iterando un HashSet
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }

//        Iterando con while y Iterator
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

//        Iterando con Stream foreach
        sa.forEach(System.out::println);
    }
}
