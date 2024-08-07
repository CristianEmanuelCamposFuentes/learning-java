package Threads.Ejemplos;

public class EjemploInterfaceRunnableJava8 {

    public static void main(String[] args) throws InterruptedException {
        // Obtener el Thread principal del main
        Thread main = Thread.currentThread();
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
                // Estado del main
                System.out.println(main.getState());
        };
        Thread v1 = new Thread(viaje,"Isla de Pascua");
        Thread v2 = new Thread(viaje,"Isla de Chilena");
        Thread v3 = new Thread(viaje,"Isla de Mar del Plata");
        Thread v4 = new Thread(viaje,"Isla de Bahia Blanca");
        Thread v5 = new Thread(viaje,"Isla de CABA");
        Thread v6 = new Thread(viaje,"Isla de Cordoba");

        v1.start();
        v2.start();
        v3.start();
        v4.start();
        v5.start();
        v6.start();
        v1.join();
        v2.join();
        v3.join();
        v4.join();
        v5.join();
        v6.join();
        //Thread.sleep(1000);

        System.out.println("Continuando con la ejecucion del metodo main: " + main.getName());
    }
}
