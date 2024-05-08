package POO.Herencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lopez");
        alumno.setEdad(20);
        alumno.setInstitucion("UTN");
        alumno.setNotaLenguaje(9);
        Profesor profes = new Profesor();
        profes.setNombre("Jose");
        profes.setApellido("Perez");
        profes.setEdad(30);
        profes.setMateria("Matematicas");
        System.out.println("Alumno: " + alumno.getNombre());
        System.out.println("Profesor: " + profes.getNombre());
    }
}
