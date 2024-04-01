package Clases.Math;

import java.security.spec.RSAOtherPrimeInfo;

public class EjemploClaseMathRandom {

    public static void main(String[] args) {

        String[] colores = {"rojo", "azul", "verde", "amarillo", "morado", "negro", "blanco"};
        // Valor random entre 0 y 1, sin incluirlo
        double random = Math.random();
        System.out.println("El valor random es: " + random);

        random *= colores.length;

        random = Math.floor(random);
        System.out.println("El valor random redondeado entero es: " + random);
        System.out.println("El color random es: " + colores[(int) random]);
    }
}
