package POO.Automovil;

public class EjemploAutomovil {

    public static void main(String[] args) {
        Automovil miRenault = new Automovil();
        Motor renault = new Motor(2.0, TipoMotor.BENCINA);
        miRenault.setFabricante("Renault");
        miRenault.setModelo("Kangoo");
        miRenault.setColor(Color.BLANCO);
        miRenault.setmotor(renault);
        miRenault.setestanque(new Estanque());
        System.out.println("Kilometros por litro: " + miRenault.calcularConsumo(110, 0.5f));
        System.out.println(miRenault.verDetalles());
        miRenault.arrancar();
        miRenault.acelerar(90);
        miRenault.frenar();

        Automovil miAudi = new Automovil();
        Motor audi = new Motor(2.0, TipoMotor.BENCINA);
        miAudi.setFabricante("Audi");
        miAudi.setModelo("A4");
        miAudi.setColor(Color.AZUL);
        miAudi.setmotor(audi);
        miAudi.setestanque(new Estanque(45));
        System.out.println("Kilometros por litro: " + miAudi.calcularConsumo(120, 0.5f));
        System.out.println(miAudi.verDetalles());
        miAudi.arrancar();
        miAudi.acelerar(55);
        miAudi.frenar();

        Automovil miVolkswagen = new Automovil();
        Motor volkswagen = new Motor(1.6, TipoMotor.DIESEL);
        miVolkswagen.setFabricante("Volkswagen");
        miVolkswagen.setModelo("Golf");
        miVolkswagen.setColor(Color.VERDE);
        miVolkswagen.setmotor(volkswagen);
        miVolkswagen.setestanque(new Estanque(50));
        System.out.println("Kilometros por litro: " + miVolkswagen.calcularConsumo(95, 0.5f));
        System.out.println(miVolkswagen.verDetalles());
        miVolkswagen.arrancar();
        miVolkswagen.acelerar(100);
        miVolkswagen.frenar();

        // Ahora un Nissan Navara creado a partir de la clase Automovil
        Motor nissan = new Motor(1.8, TipoMotor.DIESEL);
        Automovil miNissan = new Automovil("Nissan", "Navara", Color.AMARILLO, nissan);
        miNissan.setestanque(new Estanque(40));
        System.out.println("Kilometros por litro: " + miNissan.calcularConsumo(120, 0.5f));
        System.out.println(miNissan.verDetalles());
        miNissan.arrancar();
        miNissan.acelerar(55);
        miNissan.frenar();

        Motor nissan2 = new Motor(2.5, TipoMotor.BENCINA);
        Automovil miNissan2 = new Automovil("Nissan", "Navara", Color.AZUL, nissan2);
        miNissan2.setestanque(new Estanque(60));
        // Comparar objetos
        System.out.println("miNissan es igual a miNissan2? " + (miNissan == miNissan2));
        System.out.println("miNissan es igual a miNissan2 con equals? " + miNissan.equals(miNissan2));
    }
}
