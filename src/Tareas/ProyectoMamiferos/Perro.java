package Tareas.ProyectoMamiferos;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro salvaje africano caza en grupo en la " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El Perro salvaje africano duerme en la " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Perro salvaje africano corre en la " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El Perro salvaje africano se comunica con su manada mediante ladridos y gruñidos";
    }
}

