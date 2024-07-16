package POO.Genericos.genericsclass;

public class EjemploGenericos2 {

    public static void main(String[] args) {
        Camion<Animal> transCaballos = new Camion<>(5);
        transCaballos.addObjeto(new Animal("Pepito", TipoAnimal.CABALLO));
        transCaballos.addObjeto(new Animal("Pepita", TipoAnimal.CABALLO));
        transCaballos.addObjeto(new Animal("Rayo de luz", TipoAnimal.CABALLO));
        transCaballos.addObjeto(new Animal("Tiro al blanco", TipoAnimal.CABALLO));
        transCaballos.addObjeto(new Animal("Centurion", TipoAnimal.CABALLO));


        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.addObjeto(new Maquinaria("Cultivadora"));
        transMaquinas.addObjeto(new Maquinaria("Bulldozer"));
        transMaquinas.addObjeto(new Maquinaria("Excavadora"));


        Camion<Auto> transAuto = new Camion<>(2);
        transAuto.addObjeto(new Auto("Toyota"));
        transAuto.addObjeto(new Auto("Ford"));

        imprimirCamion(transCaballos);
        imprimirCamion(transMaquinas);
        imprimirCamion(transAuto);
    }

    public static <T> void imprimirCamion(Camion<T> camion){
        for(T a : camion){
            if(a instanceof Animal){
                System.out.println(((Animal)a).getNombre() + " - " + ((Animal)a).getTipo());
            }
            if(a instanceof Maquinaria){
                System.out.println(((Maquinaria)a).getTipo());
            }
            if(a instanceof Auto){
                System.out.println(((Auto)a).getMarca());
            }

        }
    }
}