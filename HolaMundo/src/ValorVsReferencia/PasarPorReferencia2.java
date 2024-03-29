package ValorVsReferencia;

class Persona {
    private String nombre;
    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String getNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {
        // Las clases wrapper no son inmutables, por lo tanto no se puede reasignar el valor
        // Para solucionar esto se puede hacer con nuevas clases
        Persona persona = new Persona();
        persona.modificarNombre("Taba");
        System.out.println("Nombre de la persona: " + persona.getNombre());

        test(persona);
        System.out.println("Nombre de la persona: " + persona.getNombre());
    }
    // static se puede invocar sin instanciar la clase
    // siempre se pasan datos de un objeto a otro mediante metodos
    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test ");
        persona.modificarNombre("Cristian");
        System.out.println("Terminamos el metodo test ");
    }
}
