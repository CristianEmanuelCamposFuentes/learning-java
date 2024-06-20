package Tareas.ProyectoMamiferos;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];

        mamiferos[0] = new Leon("Sabana", 1.2f, 2.4f, 190.5f, "Panthera leo", 8.0f, 60, 15, 114.0f);
        mamiferos[1] = new Tigre("Selva", 1.1f, 3.1f, 220.0f, "Panthera tigris", 7.0f, 65, "Tigre de Bengala");
        mamiferos[2] = new Guepardo("Sabana", 0.9f, 2.0f, 72.0f, "Acinonyx jubatus", 5.0f, 120);
        mamiferos[3] = new Lobo("Bosque", 0.8f, 1.6f, 50.0f, "Canis lupus", "Gris", 4.0f, 6, "Lobo Gris");
        mamiferos[4] = new Perro("Sabana", 0.7f, 1.5f, 30.0f, "Lycaon pictus", "Manchado", 3.5f, 320);

        for (Mamifero mamifero : mamiferos) {
            System.out.println("  Nombre cientifico: " + mamifero.getNombreCientifico() + ".");
            System.out.println("  Comer: " + mamifero.comer());
            System.out.println("  Dormir: " + mamifero.dormir());
            System.out.println("  Correr: " + mamifero.correr());
            System.out.println("  Comunicarse: " + mamifero.comunicarse());
            System.out.println("\n");
        }
    }
}

