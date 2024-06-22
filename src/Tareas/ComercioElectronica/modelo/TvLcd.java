package Tareas.ComercioElectronica.modelo;

public class TvLcd extends Electronico {
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    @Override
    public double getPrecioVenta() {
        return this.precio * 1.1; // Ejemplo de cálculo de precio de venta
    }
}
