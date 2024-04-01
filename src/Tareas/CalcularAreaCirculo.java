package Tareas;

import javax.swing.*;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
//        Pedir el radio de un círculo y calcular su área.
//utilizar la formula:
//area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
        double radio, area;
        // Se ingresa un string y se parsea a double.
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cual es el radio del circulo?"));
        area = Math.PI * Math.pow(radio, 2);
        // Se muestra el resultado con un mensaje.
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
    }
}
