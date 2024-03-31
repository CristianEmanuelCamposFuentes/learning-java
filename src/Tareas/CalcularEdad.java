package Tareas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        // Calcular edad ingresando la fecha de nacimiento de una persona.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = scanner.nextLine();
        // Parsear la fecha a un objeto java.util.Date
        SimpleDateFormat formatoFecha = new SimpleDateFormat( "dd/MM/yyyy");
        try {
            Date fecha = formatoFecha.parse(fechaNacimiento);
            // Calcular la fecha actual
            Date fechaActual = new Date();
            // Calcular la edad
            long tiempoTranscurrido = fechaActual.getTime() - fecha.getTime();
            long tiempoEnSegundos = tiempoTranscurrido / 1000;
            long tiempoEnMinutos = tiempoEnSegundos / 60;
            long tiempoEnHoras = tiempoEnMinutos / 60;
            long tiempoEnDias = tiempoEnHoras / 24;
            long tiempoEnAnios = tiempoEnDias / 365;
            // Imprimir la edad
            System.out.println("Tu edad es: " + tiempoEnAnios);
        } catch (ParseException e) {
            System.out.println("Error al parsear la fecha: " + e.getMessage());
        }
    }
//      Scanner scanner = new Scanner(System.in);
//    Calendar calendar = Calendar.getInstance();
//    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
//    System.out.println("Enter your born date (dd/MM/yyyy): ");
//    String date = scanner.nextLine();
//    Date currentDate = new Date();
//    try {
//        Date bornDate = simpleDateFormat.parse(date);
//        calendar.setTime(bornDate);
//        int bornYear = calendar.get(Calendar.YEAR);
//        int bornMonth = calendar.get(Calendar.MONTH);
//        int bornDay = calendar.get(Calendar.DAY_OF_MONTH);
//        calendar.setTime(currentDate);
//        int currentYear = calendar.get(Calendar.YEAR);
//        int currentMonth = calendar.get(Calendar.MONTH);
//        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
//        int age = currentYear - bornYear;
//        if (currentMonth < bornMonth) {
//            age--;
//        } else if (currentMonth == bornMonth && currentDay < bornDay) {
//            age--;
//        }
//        System.out.println("Your age is: " + age);
//
//    } catch (ParseException e) {
//        System.err.println("Invalid date format");
//    }
//
//}
}
