package Tareas.ComercioElectronica.modelo;

public abstract class Producto implements IProducto {
    protected int precio;

    public Producto(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }
}
