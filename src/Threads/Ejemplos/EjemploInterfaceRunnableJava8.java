package Threads.Ejemplos;

public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) {
        Runnable viaje = () -> {
                for (int i = 0; i < 10; i++){
                    System.out.println(i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep((long) (Math.random() * 1000));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Finalmente me voy de viaje a " + Thread.currentThread().getName());
        };
        new Thread(viaje,"Isla de Pascua").start();
        new Thread(viaje,"Isla de Chilena").start();
        new Thread(viaje,"Isla de Mar del Plata").start();
        new Thread(viaje,"Isla de Bahia Blanca").start();
        new Thread(viaje,"Isla de CABA").start();
        new Thread(viaje,"Isla de Cordoba").start();
    }
}
