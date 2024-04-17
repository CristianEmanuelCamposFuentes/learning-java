package POO.Automovil;

public class EjemploAutomovil {

    public static void main(String[] args) {
        Automovil MiRenault = new Automovil();
        MiRenault.setFabricante("Renault");
        MiRenault.setModelo("Kangoo");
        MiRenault.setColor("Rojo");
        MiRenault.setCilindrada(1.6);
        MiRenault.setCilindrada(50);
        System.out.println("Kilometros por litro: " + MiRenault.calcularConsumo(110, 0.5f));
        System.out.println(MiRenault.verDetalles());
        MiRenault.arrancar();
        MiRenault.acelerar(90);
        MiRenault.frenar();

        Automovil MiAudi = new Automovil();
        MiAudi.setFabricante("Audi");
        MiAudi.setModelo("A4");
        MiAudi.setColor("Blanco");
        MiAudi.setCilindrada(1.8);
        MiAudi.setCapacidadTanque(50);
        System.out.println("Kilometros por litro: " + MiAudi.calcularConsumo(120, 0.5f));
        System.out.println(MiAudi.verDetalles());
        MiAudi.arrancar();
        MiAudi.acelerar(55);
        MiAudi.frenar();

        Automovil MiVolkswagen = new Automovil();
        MiVolkswagen.setFabricante("Volkswagen");
        MiVolkswagen.setModelo("Golf");
        MiVolkswagen.setColor("Verde");
        MiVolkswagen.setCilindrada(1.6);
        MiVolkswagen.setCapacidadTanque(40);
        System.out.println("Kilometros por litro: " + MiVolkswagen.calcularConsumo(95, 0.5f));
        System.out.println(MiVolkswagen.verDetalles());
        MiVolkswagen.arrancar();
        MiVolkswagen.acelerar(100);
        MiVolkswagen.frenar();

        // Ahora un Nissan Navara creado a partir de la clase Automovil
        Automovil MiNissan = new Automovil("Nissan", "Navara", "Negro", 1.8, 50);
        System.out.println("Kilometros por litro: " + MiNissan.calcularConsumo(120, 0.5f));
        System.out.println(MiNissan.verDetalles());
        MiNissan.arrancar();
        MiNissan.acelerar(55);
        MiNissan.frenar();

        Automovil MiNissan2 = new Automovil("Nissan", "Navara", "Negro", 1.8, 50);
        // Comparar objetos
        System.out.println("MiNissan es igual a MiNissan2? " + (MiNissan == MiNissan2));
        System.out.println("MiNissan es igual a MiNissan2 con equals? " + MiNissan.equals(MiNissan2));
    }
}
