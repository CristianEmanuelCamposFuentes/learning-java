package POO.Genericos.genericsclass;

public class Animal {

    private String nombre;
    private TipoAnimal tipo;

    public Animal(String nombre, TipoAnimal tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public TipoAnimal getTipo() {
        return this.tipo;
    }
}
