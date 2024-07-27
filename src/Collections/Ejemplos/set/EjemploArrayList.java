package Collections.Ejemplos.set;

import Collections.Ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Cristian", 8));
        al.add(new Alumno("Cintia", 6));
        al.add(new Alumno("Emanuel", 9));
        al.add(new Alumno("Anahi", 3));
        al.add(new Alumno("Platon", 8));
        al.add(new Alumno("Ricardo", 7));
        al.set(3, new Alumno("Andres",3));

        System.out.println(al + ", size = " + al.size());

//        al.remove(new Alumno("Marina", 5));

        System.out.println(al + ", size = " + al.size());

        boolean b = al.contains(new Alumno("Ricardo", 7));
        System.out.println("La lista contiene a Ricardo: " + b);

        Object a[] = al.toArray();
        for(int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
