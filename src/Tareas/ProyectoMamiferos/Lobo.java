package Tareas.ProyectoMamiferos;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo " + especieLobo + " caza en manada en la " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El Lobo " + getColor() + " duerme en las cavernas de " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Lobo corre a gran velocidad en la " + getHabitat();
    }

    @Override
    public String comunicarse() {
        return "El Lobo " + especieLobo + " aúlla para comunicarse con su manada";
    }
}

