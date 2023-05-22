/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicioslogicos1;

/**
 *
 * @author crist
 */
public class EjerciciosLogicos1 {

    public static void main(String[] args) {
        int num1, num2, aux;
        num1 = 4;
        num2 = 10;
        
        
        System.out.println("El valor de num1 es: " + num1);
        System.out.println("El valor de num1 es: " + num2);
        
        System.out.println("---- Proceso ----");
        aux = num1;
        num1 = num2;
        num2 = aux;
        System.out.println("El valor de num1 es: " + num1);
        System.out.println("El valor de num1 es: " + num2);
    }
}
