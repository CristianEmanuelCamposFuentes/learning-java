package POO.Interfaces.CrudRepositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;
import POO.Interfaces.CrudRepositorio.repositorio.*;
import POO.Interfaces.CrudRepositorio.repositorio.excepciones.AccesoDatoException;
import POO.Interfaces.CrudRepositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import POO.Interfaces.CrudRepositorio.repositorio.excepciones.LecturaAccesoDatoException;
import POO.Interfaces.CrudRepositorio.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {
        try {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Javier", "Perez"));
        repo.crear(new Cliente("Maria", "Lopez"));
        repo.crear(new Cliente("Luis", "Gonzalez"));
        repo.crear(new Cliente("Ana", "Garcia"));

        repo.crear(null);
        System.out.println("Listar todos");
        List<Cliente> clientes = repo.listar();
        clientes.forEach(System.out::println);

        System.out.println("Listar con paginacion");
        List<Cliente> paginable = (repo).listar(1, 3); // Casting.
        paginable.forEach(System.out::println);

        System.out.println("Listar por ordenacion");
        List<Cliente> clientesOrdenASC = (repo)
                .listar("nombre", Direccion.ASCENDENTE);
        for(Cliente c: clientesOrdenASC){
            System.out.println(c);
        }

        System.out.println("Editar un cliente");
        Cliente clActualizado = new Cliente("Maria", "Martinez");
        clActualizado.setId(2);
        repo.editar(clActualizado);
        Cliente clAnterior = repo.porId(2);
        System.out.println(clAnterior);

        System.out.println("Listar por ordenacion descendente de apellido");
        repo.listar("apellido", Direccion.DESCENDENTE)
                .forEach(System.out::println);

        System.out.println("Eliminar un cliente");
        repo.eliminar(3);
        System.out.println("Cliente eliminado :" + repo.porId(3));
        repo.listar().forEach(System.out::println);

        System.out.println("Conteo total de clientes:");
        System.out.println(repo.count());

        }catch (LecturaAccesoDatoException e){
            System.out.println("LecturaAccesoDatoException: " + e.getMessage());
            e.printStackTrace();
        }  catch (EscrituraAccesoDatoException e) {
            System.out.println("EscrituraAccesoDatoException: " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Generica AccesoDatoException: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
