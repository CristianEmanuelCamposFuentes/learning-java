package POO.Herencia;

public class Profesor extends Persona {
    private String materia;

    public Profesor() {
        System.out.println("Profesor: Inicializando constructor");
    }

    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        super(nombre, apellido, edad);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
