package Tareas.ProyectoOrdenCompra;

import java.util.Date;

public class ProyectoOrdenCompra {
    // La tarea es crear un proyecto nuevo llamado ProyectoOrdenCompra de la siguiente manera:
    //
    //Se requiere crear la clase OrdenCompra con los siguientes campos privados: identificador tipo Integer autoincremental, descripcion String, fecha tipo Date, cliente del tipo Cliente y finalmente un atributo de tipo arreglo de productos con 4 elementos: Producto[] productos.
    //
    //En la clase OrdenCompra, crear constructor que inicialice solo la descripción.
    //
    //En la clase OrdenCompra, crear métodos getter para todos los atributos.
    //
    //En la clase OrdenCompra implementar sólo métodos set para cliente y fecha.
    //
    //Respecto a los productos de la clase OrdenCompra, sólo se pueden agregar usando el método public void addProducto (Producto producto), nada más, es decir no se pueden agregar en el constructor ni en métodos setter.
    //
    //La clase OrdenCompra debe tener un método que devuelva el gran total, sumando los precios de los productos.
    //
    //Crear la clase Producto con tres atributos fabricante tipo String y nombre String y precio int, inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.
    //
    //Crear la clase Cliente con dos atributos nombre y apellido, inicializar todos sus valores en el constructor e implementar sus respectivos métodos getter.
    //
    //Escribir un programa, clase con método main, la cual llamaremos EjemploOrdenes:
    //
    //Crear tres órdenes, con sus respectivos valores, el cliente, agregar los cuatro productos a cada una, cada orden con distintos productos, que no se repitan.
    //
    //Para cada una imprimir sus valores en consola usando método getter incluyendo los productos, donde con el método getter obtenemos el arreglo de productos y con un foreach recorremos e imprimimos sus atributos fabricante, nombre y precio. Tener en cuenta en la salida el gran total de cada orden, los clientes completos
    public static void main(String[] args) {

        OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
        orden1.setCliente(new Cliente("Andres", "Guzman"));
        orden1.setFecha(new Date());

        orden1.addProducto(new Producto("Western Digital", "Unidad SSD 480GB", 54890));
        orden1.addProducto(new Producto("MSI", "Monitor Optix G271", 363940));
        orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 5900X", 599990));
        orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX 3080Ti", 1849990));

        OrdenCompra orden2 = new OrdenCompra("Compras Electrodomésticos");
        orden2.setCliente(new Cliente("John", "Doe"));
        orden2.setFecha(new Date());
        orden2.addProducto(new Producto("Fensa", "Cocina", 239990));
        orden2.addProducto(new Producto("Samsung", "Refrigerador", 429990));
        orden2.addProducto(new Producto("Midea", "Lavadora", 149990));
        orden2.addProducto(new Producto("Aspiradora", "IRobot", 199990));

        OrdenCompra orden3 = new OrdenCompra("Compras materiales de construcción");
        orden3.setCliente(new Cliente("Pepa", "Roe"));
        orden3.setFecha(new Date());
        orden3.addProducto(new Producto("Melon", "Cemento 25kg", 4870));
        orden3.addProducto(new Producto("Grau", "Hormigon", 6040));
        orden3.addProducto(new Producto("Ceramicas Santiago", "Ladrillo", 790));
        orden3.addProducto(new Producto("Redline", "Escala articulada aluminio", 48990));

        OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");
        }
    }

}