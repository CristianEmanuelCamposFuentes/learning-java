package POO.Automovil;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {


        Automovil miRenault = new Automovil("Renault", "Kangoo");
        miRenault.setColor("Rojo");
        miRenault.setCilindrada(2.0);

        Automovil miAudi = new Automovil("Audi", "A4", "Blanco", 1.8);

        Automovil miMazda = new Automovil("Mazda", "6", "Rojo", 2.0, 50);

        // Si es por default, se puede modificar la variable de clase static
        Automovil.setColorPatente("Azul");

        System.out.println(miRenault.verDetalles());
        System.out.println(miAudi.verDetalles());
        Automovil.setCapacidadTanqueEstatico(45);
        System.out.println(miMazda.verDetalles());

        System.out.println("Auto color patente, variable de clase: " + Automovil.getColorPatente());
        // Como el metodo va a ser igual para todas las instancias de la clase, se recomienda utilizar el nombre de la clase
        System.out.println("Kilometros por litros estatico: " + Automovil.calcularConsumoEstatico(300, 60));
    }
}
