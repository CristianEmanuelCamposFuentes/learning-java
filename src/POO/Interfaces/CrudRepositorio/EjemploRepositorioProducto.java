package POO.Interfaces.CrudRepositorio;

import POO.Interfaces.CrudRepositorio.modelo.Producto;
import POO.Interfaces.CrudRepositorio.repositorio.Direccion;
import POO.Interfaces.CrudRepositorio.repositorio.OrdenablePaginableCrudRepositorio;
import POO.Interfaces.CrudRepositorio.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {
        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 50.34));
        repo.crear(new Producto("Silla", 40.34));
        repo.crear(new Producto("Lampara", 11.85));
        repo.crear(new Producto("Notebook", 499.99));

        System.out.println("Listar todos");
        List<Producto> productos = repo.listar();
        productos.forEach(System.out::println);

        System.out.println("Listar con paginacion");
        List<Producto> paginable = (repo).listar(1, 3); // Casting.
        paginable.forEach(System.out::println);

        System.out.println("Listar por ordenacion");
        List<Producto> productosOrdenASC = (repo)
                .listar("nombre", Direccion.ASCENDENTE);
        for(Producto c: productosOrdenASC){
            System.out.println(c);
        }

        System.out.println("Editar un producto");
        Producto clActualizado = new Producto("Lapiz", 7.99);
        clActualizado.setId(2);
        repo.editar(clActualizado);
        Producto clAnterior = repo.porId(2);
        System.out.println(clAnterior);

        System.out.println("Listar por ordenacion descendente de Precio");
        repo.listar("precio", Direccion.DESCENDENTE)
                .forEach(System.out::println);

        System.out.println("Eliminar un producto");
        System.out.println("Producto eliminado :" + repo.porId(3));
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

        System.out.println("Conteo total de productos:");
        System.out.println(repo.count());

    }
}
