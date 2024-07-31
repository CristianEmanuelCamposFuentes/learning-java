package Collections.Ejemplos.list;

import Collections.Ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Cristian", 8));
        enlazada.add(new Alumno("Cintia", 6));
        enlazada.add(new Alumno("Emanuel", 9));
        enlazada.add(new Alumno("Anahi", 3));
        enlazada.add(new Alumno("Platon", 8));
        enlazada.add(new Alumno("Ricardo", 7));
        enlazada.set(3, new Alumno("Andres",3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        enlazada.addFirst(new Alumno("Kiki", 5));
        enlazada.addLast(new Alumno("Jimena", 7));

        System.out.println(enlazada + ", size = " + enlazada.size());

        // Otros metodos
        System.out.println("Primer elemento = " + enlazada.getFirst());
        System.out.println("Ultimo elemento = " + enlazada.getLast());
        System.out.println("Peek primero = " + enlazada.peekFirst());
        System.out.println("Peek ultimo = " + enlazada.peekLast());
        System.out.println("Indice 2 = " + enlazada.get(2).getNombre());

        // Eliminan el objeto y lo devuelven
        Alumno primeroEliminado = enlazada.pollFirst();
        System.out.println(primeroEliminado.getNombre());

        Alumno ultimoEliminado = enlazada.pollLast();
        System.out.println(ultimoEliminado.getNombre());
        System.out.println(enlazada + ", size = " + enlazada.size());

        // remove elimina el primer elemento y lo devuelve
        Alumno primero = enlazada.remove();
        System.out.println(primero.getNombre());
        System.out.println(enlazada + ", size = " + enlazada.size());

        // Agregar alumno
        Alumno al = new Alumno("Cristian", 8);
        enlazada.add(al);
        System.out.println(enlazada + ", size = " + enlazada.size());

        // Ordenar alfabeticamente
        enlazada.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println(enlazada);

        // Iterar
        System.out.println("Iterando con Stream forEach");
        enlazada.forEach(System.out::println);

        // Retorna el indice de un elemento
        System.out.println("Indice de Platon = " + enlazada.indexOf(new Alumno("Platon", 8)));

        // Reemplazar un elemento
        enlazada.set(3, new Alumno("Arturo",10));

        enlazada.sort(Comparator.comparing(Alumno::getNombre));
        enlazada.forEach(System.out::println);

        // Agregamos el List Iterator
        ListIterator<Alumno> li = enlazada.listIterator();

        System.out.println("Iterando con Next : ");
        while(li.hasNext()) {
            Alumno a = li.next();
            System.out.println("Alumno con iterator = " + a.getNombre());
        }

        System.out.println("Iterando con Previous : ");
        while(li.hasPrevious()) {
            Alumno a = li.previous();
            System.out.println("Alumno con iterator = " + a.getNombre());
        }
    }
}
