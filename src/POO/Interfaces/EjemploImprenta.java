package POO.Interfaces;

import POO.Interfaces.modelo.Curriculum;
import POO.Interfaces.modelo.Hoja;
import POO.Interfaces.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Javier", "Ingeniero de Software", "Estoy aprendiendo POO");
        cv.agregarExperiencia("Trabajo en google");
        cv.agregarExperiencia("Trabajo en facebook");
        cv.imprimir();

        Informe informe = new Informe( "Luciana Holmes", "Martin P Douglas","Estudio sobre Microservicios");
        imprimir(cv);
        imprimir(informe);


    }

    public static void imprimir(Hoja imprimible){
        imprimible.imprimir();
    }
}
