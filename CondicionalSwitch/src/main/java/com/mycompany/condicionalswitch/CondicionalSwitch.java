/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicionalswitch;

/**
 *
 * @author crist
 */
public class CondicionalSwitch {

    public static void main(String[] args) {
        System.out.println("Condicional Switch: ");
        
        int dia = 1;
        String nombreDia;
        
        switch(dia){
        
            case 1: nombreDia = "Domingo";
            break;
            case 2: nombreDia = "Lunes";
            break;
            case 3: nombreDia = "Martes";
            break;
            case 4: nombreDia = "Miercoles";
            break;
            case 5: nombreDia = "Jueves";
            break;
            case 6: nombreDia = "Viernes";
            break;
            case 7: nombreDia = "Sabado";
            break;
            
            default: nombreDia = "Ingrese un dia correcto.";
        
        }
        
        System.out.println("Su dia seleccionado es: " + nombreDia);
    }
}
