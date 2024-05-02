package POO.Automovil;

public class EjemploAutomovilEnum {

    public static void main(String[] args) {

        Automovil.setCapacidadTanqueEstatico(45);
        Automovil miMazda = new Automovil("Mazda", "RX-7");
        miMazda.setCilindrada(2.0);
        miMazda.setColor(Color.AMARILLO);
        miMazda.setTipo(TipoAutomovil.COUPE);
        System.out.println(miMazda.verDetalles());

        // Obtener el valor del atributo de enum
        Automovil miAudi = new Automovil("Audi", "A4", Color.BLANCO, 1.8);
        miAudi.setTipo(TipoAutomovil.CONVERTIBLE);
        System.out.println(miAudi.verDetalles());

        TipoAutomovil tipo = miMazda.getTipo();
        System.out.println("Tipo de auto: " + tipo.getNombre() + ", \n" + tipo.getDescripcion() + ", \n" + tipo.getNumPuertas());


        switch (tipo) {
            case CONVERTIBLE -> System.out.println("Es un convertible");
            case COUPE -> System.out.println("Es un coupe");
            case FURGON -> System.out.println("Es un furgon");
            case HATCHBACK -> System.out.println("Es un hatchback");
            case PICKUP -> System.out.println("Es un pickup");
            case SEDAN -> System.out.println("Es un sedan");
            case STATION_WAGON -> System.out.println("Es un station wagon");
            default -> System.out.println("No se reconoce el tipo de auto");
        }

        // Recorrer los Enums
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.println(ta + " -> " + ta.getNombre());
        }
    }
}
