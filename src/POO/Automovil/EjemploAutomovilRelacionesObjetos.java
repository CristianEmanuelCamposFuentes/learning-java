package POO.Automovil;

public class EjemploAutomovilRelacionesObjetos {

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

        Rueda[] ruedasAudi = new Rueda[5];
        for (int i = 0; i < ruedasAudi.length; i++) {
            miAudi.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

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

        Rueda[] ruedasVolkswagen = new Rueda[5];
        for (int i = 0; i < ruedasVolkswagen.length; i++) {
            miVolkswagen.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        // Ahora un Nissan Navara creado a partir de la clase Automovil
        Motor nissan = new Motor(1.8, TipoMotor.DIESEL);
        Automovil miNissan = new Automovil("Nissan", "Navara", Color.AMARILLO, nissan);
        miNissan.setestanque(new Estanque(40));
        System.out.println("Kilometros por litro: " + miNissan.calcularConsumo(120, 0.5f));
        System.out.println(miNissan.verDetalles());
        miNissan.arrancar();
        miNissan.acelerar(55);
        miNissan.frenar();

        Rueda[] ruedasNissan1 = new Rueda[5];
        for (int i = 0; i < ruedasNissan1.length; i++) {
            miNissan.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Motor nissan2 = new Motor(2.5, TipoMotor.BENCINA);
        Automovil miNissan2 = new Automovil("Nissan", "Navara", Color.AZUL, nissan2);
        miNissan2.setestanque(new Estanque(60));

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int i = 0; i < ruedasNissan2.length; i++) {
            miNissan2.addRueda(new Rueda("Yokohama", 16, 7.5));
        }
        // Comparar objetos
        System.out.println("miNissan es igual a miNissan2? " + (miNissan == miNissan2));
        System.out.println("miNissan es igual a miNissan2 con equals? " + miNissan.equals(miNissan2));
    }
}
