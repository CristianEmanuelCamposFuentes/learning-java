package POO.Automovil;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupe", "Auto deportivo", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final int numPuertas;
    private final String descripcion;

    TipoAutomovil(String nombre, String descripcion, int numPuertas) {
        this.nombre = nombre;
        this.numPuertas = numPuertas;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
