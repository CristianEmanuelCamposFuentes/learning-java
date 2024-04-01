package Clases.Math;

import java.util.Random;

public class EjemploClaseRandom {

    public static void main(String[] args) {

        String[] colores = {"rojo", "azul", "verde", "amarillo", "morado", "negro", "blanco"};

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt();
        System.out.println("El valor aleatorio es: " + randomInt);

        int randomInt2 = randomObj.nextInt(colores.length);
        System.out.println("El valor aleatorio es: " + randomInt2);
        System.out.println("El valor aleatorio es: " + colores[randomInt2]);

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("El valor aleatorio es: " + randomInt);
        System.out.println("El valor aleatorio es: " + colores[randomInt]);
    }
}
