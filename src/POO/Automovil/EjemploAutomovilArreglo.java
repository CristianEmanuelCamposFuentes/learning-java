package POO.Automovil;

import java.util.Arrays;

public class EjemploAutomovilArreglo {


    public static void main(String[] args) {

        Persona conductorRenault = new Persona("Taba", "Campos");
        Automovil miRenault = new Automovil();
        Motor renault = new Motor(2.0, TipoMotor.BENCINA);
        miRenault.setFabricante("Renault");
        miRenault.setModelo("Kangoo");
        miRenault.setColor(Color.BLANCO);
        miRenault.setmotor(renault);
        miRenault.setestanque(new Estanque());
        miRenault.setConductor(conductorRenault);

        Persona conductorAudi = new Persona("Cintia", "Utrera");
        Automovil miAudi = new Automovil();
        Motor audi = new Motor(2.0, TipoMotor.BENCINA);
        miAudi.setFabricante("Audi");
        miAudi.setModelo("A4");
        miAudi.setColor(Color.AZUL);
        miAudi.setmotor(audi);
        miAudi.setestanque(new Estanque(45));
        miAudi.setConductor(conductorAudi);

        Automovil miVolkswagen = new Automovil();
        Motor volkswagen = new Motor(1.6, TipoMotor.DIESEL);
        miVolkswagen.setFabricante("Volkswagen");
        miVolkswagen.setModelo("Golf");
        miVolkswagen.setColor(Color.VERDE);
        miVolkswagen.setmotor(volkswagen);
        miVolkswagen.setestanque(new Estanque(50));
        miVolkswagen.setConductor(conductorAudi);   

        Persona conductorNissan = new Persona("Juan", "Perez");
        // Ahora un Nissan Navara creado a partir de la clase Automovil
        Motor nissan = new Motor(1.8, TipoMotor.DIESEL);
        Automovil miNissan = new Automovil("Nissan", "Navara", Color.AMARILLO, nissan);
        miNissan.setestanque(new Estanque(40));
        miNissan.setConductor(conductorNissan);

        Persona conductorNissan2 = new Persona("Luis", "Gonzalez");
        Motor nissan2 = new Motor(2.5, TipoMotor.BENCINA);
        Automovil miNissan2 = new Automovil("Nissan", "Navara", Color.AZUL, nissan2);
        miNissan2.setestanque(new Estanque(60));
        miNissan2.setConductor(conductorNissan2);   
        // Arreglo de objetos
        Automovil[] autos = {miRenault, miAudi, miVolkswagen, miNissan, miNissan2}; 
        // Mostrar el arreglo 
        for (Object auto : autos) {
            System.out.println(auto);
        }
        // Ordenar por modelo
        Arrays.sort(autos);
        // Mostrar el arreglo
        System.out.println("Arreglo de autos ordenados por fabricante");
        for (Object auto : autos) {
            System.out.println(auto);
        }
    }
}
