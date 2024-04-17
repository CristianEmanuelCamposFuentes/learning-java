package POO.Automovil;

public class EjemploAutomovil {

    public static void main(String[] args) {
        Automovil MiRenault = new Automovil();
        MiRenault.fabricante = "Renault";
        MiRenault.modelo = "Clio";
        MiRenault.color = "Rojo";
        MiRenault.cilindrada = 1.6;
        MiRenault.capacidadTanque = 50;
        System.out.println("Kilometros por litro: " + MiRenault.calcularConsumo(110, 0.5f));
        System.out.println(MiRenault.verDetalles());
        MiRenault.arrancar();
        MiRenault.acelerar(90);
        MiRenault.frenar();

        Automovil MiAudi = new Automovil();
        MiAudi.fabricante = "Audi";
        MiAudi.modelo = "A4";
        MiAudi.color = "Negro";
        MiAudi.cilindrada = 2.0;
        MiAudi.capacidadTanque = 50;
        System.out.println("Kilometros por litro: " + MiAudi.calcularConsumo(120, 0.5f));
        System.out.println(MiAudi.verDetalles());
        MiAudi.arrancar();
        MiAudi.acelerar(55);
        MiAudi.frenar();

        Automovil MiVolkswagen = new Automovil();
        MiVolkswagen.fabricante = "Volkswagen";
        MiVolkswagen.modelo = "Golf";
        MiVolkswagen.color = "Blanco";
        MiVolkswagen.cilindrada = 1.6;
        MiVolkswagen.capacidadTanque = 50;
        System.out.println("Kilometros por litro: " + MiVolkswagen.calcularConsumo(95, 0.5f));
        System.out.println(MiVolkswagen.verDetalles());
        MiVolkswagen.arrancar();
        MiVolkswagen.acelerar(100);
        MiVolkswagen.frenar();
    }
}
