/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.condicionalif;

/**
 *
 * @author crist
 */
public class CondicionalIF {

    public static void main(String[] args) {
        int num1 = 110;
        int num2 = 1133;

        if (num1 > num2) {
            System.out.println("El num1 es mayor a num2.");
        } else {
            if (num1 == num2) {
                System.out.println("El num1 es igual al num2.");
            } else {
                System.out.println("El num2 es mayor a num1.");
            }

        }
    }
}

