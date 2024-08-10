package Threads.EjemplosSync;

public class Panaderia {
    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa){
        // Esperar que el consumidor se consuma el pan
        while(disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero hornea: " + this.pan);
        this.disponible = true;
        notify();
    }

    public synchronized String consumir(){
        // Esperar que el panadero se hornee el pan
        while(!disponible){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumidor consume: " + this.pan);
        this.disponible = false;
        notify();
        return pan;
    }
}
