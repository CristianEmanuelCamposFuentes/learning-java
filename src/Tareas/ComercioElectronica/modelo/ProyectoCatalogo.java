package Tareas.ComercioElectronica.modelo;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new IProducto[6];

        productos[0] = new IPhone(1000, "Apple", "Negro", "iPhone 12");
        productos[1] = new TvLcd(1500, "Samsung", 55);
        productos[2] = new TvLcd(1200, "Sony", 40);

        productos[3] = new Libro(18000, new Date(), "Eric Gamma", "Elementos Reusables POO", "Addison-Wesley");
        productos[4] = new Libro(14000, new Date(), "Martin Fowler", "UML Gota a Gota", "Pearson");

        productos[5] = new Comics(15000, new Date(), "Stan Lee", "The Amazing Spider-Man", "Marvel", "Spider-Man");

        for (IProducto producto : productos) {
            System.out.println(producto.getClass().getSimpleName() + ":");
            System.out.println("  Precio: " + producto.getPrecio());
            System.out.println("  Precio de Venta: " + producto.getPrecioVenta());

            if (producto instanceof IElectronico) {
                System.out.println("  Fabricante: " + ((IElectronico) producto).getFabricante());
            }

            if (producto instanceof ILibro) {
                ILibro libro = (ILibro) producto;
                System.out.println("  Autor: " + libro.getAutor());
                System.out.println("  Título: " + libro.getTitulo());
                System.out.println("  Editorial: " + libro.getEditorial());
                System.out.println("  Fecha de Publicación: " + libro.getFechaPublicacion());
            }

            if (producto instanceof Comics) {
                Comics comic = (Comics) producto;
                System.out.println("  Personaje: " + comic.getPersonaje());
            }

            System.out.println();
        }
    }
}
