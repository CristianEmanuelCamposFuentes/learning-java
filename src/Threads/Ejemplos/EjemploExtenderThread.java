package Threads.Ejemplos;

import Threads.Ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {

        Thread hilo = new NombreThread("Taba Campos");
        // El hilo se levanta con el metodo start(), no con el metodo run()
        hilo.start();
//        Thread.sleep(2);

        Thread hilo2 = new NombreThread("Cristian");
        // El hilo se levanta con el metodo start(), no con el metodo run()
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Padre");
        hilo3.start();

        System.out.println(hilo.getState());
    }
}
