package POO.Genericos;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;
import POO.Interfaces.CrudRepositorio.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Emanuel", "Campos"));

        Cliente emanuel = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Tito", "Perez"),
                new Cliente("Maria", "Guzman")};

        Integer[] enterosArreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);

        List<Integer> enterosLista = fromArrayToList(enterosArreglo);
        clientesLista.add(emanuel);
        clientesLista.forEach(System.out::println);

        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[]{"Emanuel", "Pepe", "Cintia"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremium = fromArrayToList(new ClientePremium[]{
                new ClientePremium("Emanuel", "Campos")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);
        imprimirClientes(clientesPremium);
    }

    public static <T> List<T> fromArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println("Elemento: " + elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }
}
