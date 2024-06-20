package Tareas.ProyectoMamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico, float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre " + especieTigre + " caza solo en la " + getHabitat();
    }

    @Override
    public String dormir() {
        return "El Tigre duerme en la " + getHabitat();
    }

    @Override
    public String correr() {
        return "El Tigre corre a una velocidad de " + getVelocidad() + " km/h";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge en la " + getHabitat();
    }
}

