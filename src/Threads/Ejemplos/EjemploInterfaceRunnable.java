package Threads.Ejemplos;

import Threads.Ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {

    public static void main(String[] args) {
        new Thread(new ViajeTarea("Isla de Pascua")).start();
        new Thread(new ViajeTarea("Isla de Chilena")).start();
        new Thread(new ViajeTarea("Isla de Mar del Plata")).start();
        new Thread(new ViajeTarea("Isla de Bahia Blanca")).start();
        new Thread(new ViajeTarea("Isla de CABA")).start();
        new Thread(new ViajeTarea("Isla de Cordoba")).start();
    }
}
