package Tareas.ProyectoMamiferos;

public class Leon extends Felino {
    private int numManada;
    private float potenciaRugidoDecibel;

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, int numManada, float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El León duerme en su hábitat " + getHabitat();
    }

    @Override
    public String correr() {
        return "El León corre a una velocidad de " + getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia de " + potenciaRugidoDecibel + " decibeles";
    }
}
