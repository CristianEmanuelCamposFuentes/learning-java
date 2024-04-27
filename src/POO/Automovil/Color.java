package POO.Automovil;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    VERDE("Verde"),
    AZUL("Azul Oscuro"),
    NARANJA("Naranja"),
    BLANCO("Blanco Perla");

    private final String color;

    // Es propio de la clase enum
    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
