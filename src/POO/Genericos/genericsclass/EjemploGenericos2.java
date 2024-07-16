package POO.Genericos.genericsclass;

public class EjemploGenericos2 {

    public static void main(String[] args) {
        Camion transporteCaballos = new Camion(5);
        transporteCaballos.addObjeto(new Animal("Pepito", TipoAnimal.CABALLO));
        transporteCaballos.addObjeto(new Animal("Pepita", TipoAnimal.CABALLO));
        transporteCaballos.addObjeto(new Animal("Rayo de luz", TipoAnimal.CABALLO));
        transporteCaballos.addObjeto(new Animal("Tiro al blanco", TipoAnimal.CABALLO));
        transporteCaballos.addObjeto(new Animal("Centurion", TipoAnimal.CABALLO));

        for (Object o : transporteCaballos) {
            Animal a = (Animal) o;

            System.out.println(a.getNombre() + " - " + a.getTipo());
        }

        Camion transMaquinas = new Camion(3);
        transMaquinas.addObjeto(new Maquinaria("Cultivadora"));
        transMaquinas.addObjeto(new Maquinaria("Bulldozer"));
        transMaquinas.addObjeto(new Maquinaria("Excavadora"));
        for(Object o : transMaquinas){
            Maquinaria m = (Maquinaria) o;
            System.out.println(m.getTipo());
        }

        Camion transAuto = new Camion(2);
        transAuto.addObjeto(new Auto("Toyota"));
        transAuto.addObjeto(new Auto("Ford"));
        for(Object o : transAuto){
            Auto a = (Auto) o;
            System.out.println(a.getMarca());
        }


    }
}