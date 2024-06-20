package Tareas.ProyectoMamiferos;

public class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza en la " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme en la " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Guepardo corre a una velocidad de " + getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo se comunica con otros guepardos mediante sonidos agudos en la " + getHabitat();
    }
}

