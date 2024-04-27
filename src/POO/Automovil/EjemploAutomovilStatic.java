package POO.Automovil;

public class EjemploAutomovilStatic {

    public static void main(String[] args) {


        Automovil miRenault = new Automovil("Renault", "Kangoo");
        miRenault.setColor(Color.ROJO);
        miRenault.setCilindrada(2.0);
        miRenault.setTipo(TipoAutomovil.FURGON);

        Automovil miAudi = new Automovil("Audi", "A4", Color.BLANCO, 1.8);
        miAudi.setTipo(TipoAutomovil.SEDAN);
        Automovil miMazda = new Automovil("Mazda", "6", Color.AMARILLO, 2.0, 50);
        miMazda.setTipo(TipoAutomovil.COUPE);

        // Si es por default, se puede modificar la variable de clase static
        Automovil.setColorPatente(Color.AMARILLO);

        System.out.println(miRenault.verDetalles());
        System.out.println(miAudi.verDetalles());
        Automovil.setCapacidadTanqueEstatico(45);
        System.out.println(miMazda.verDetalles());

        // Obtener el valor del atributo de enum
        System.out.println("Auto color patente, variable de clase: " + Automovil.getColorPatente().getColor());
        // Como el metodo va a ser igual para todas las instancias de la clase, se recomienda utilizar el nombre de la clase
        System.out.println("Kilometros por litros estatico: " + Automovil.calcularConsumoEstatico(300, 60));
        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAXIMA_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAXIMA_CIUDAD);

        TipoAutomovil tipo = miMazda.getTipo();
        System.out.println("Tipo de auto: " + tipo.getNombre() + ", \n" + tipo.getDescripcion() + ", \n" + tipo.getNumPuertas());
    }
}
