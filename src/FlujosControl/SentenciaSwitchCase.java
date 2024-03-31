package FlujosControl;

import java.util.Scanner;

public class SentenciaSwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un dia de la semana: ");
        int dia = scanner.nextInt();
        String nombreDia = null;
        switch (dia) {
        case 1:

            nombreDia = "Lunes";
            break;
        case 2:
            nombreDia = "Martes";
            break;
        case 3:
            nombreDia = "Miercoles";
            break;
        case 4:
            nombreDia = "Jueves";
            break;
        case 5:
            nombreDia = "Viernes";
            break;
        case 6:
            nombreDia = "Sabado";
            break;
        case 7:
            nombreDia = "Domingo";
            break;
        default:
            System.out.println("No es un dia de la semana");
            return;
        }
        System.out.println("Que tenga un excelente " + nombreDia + "!");
        scanner.close();
    }
}
