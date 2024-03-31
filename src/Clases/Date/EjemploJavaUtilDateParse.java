package Clases.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {

    public static void main(String[] args) throws ParseException {
        Scanner teclado = new Scanner(System.in);
        // Indicamos patron que va a tener el string en forma de fecha
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Ingrese una fecha con el formato dd-MM-yyyy");
        try {
            Date fecha = format.parse(teclado.next());
            System.out.println("La fecha es: " + fecha);
            System.out.println("La fecha en formato String es: " + format.format(fecha));

            Calendar calendario = Calendar.getInstance();
            Date fecha2 = calendario.getTime();
            System.out.println("Fecha 2: " + fecha2);
            // Comparar fechas
            if(fecha.after(fecha2)) {
                System.out.println("La fecha es posterior a la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha es anterior a la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("Las fechas son iguales");
            }

            // Comparar fechas
            Calendar calendario3 = Calendar.getInstance();
            Date fecha3 = calendario3.getTime();
            System.out.println("Fecha 3: " + fecha3);
            if(fecha.compareTo(fecha3) > 0) {
                System.out.println("Las fechas son iguales");
            } else if (fecha.compareTo(fecha3) < 0) {
                System.out.println("La fecha es posterior a la fecha actual");
            } else if (fecha.compareTo(fecha3) == 0) {
                System.out.println("Las fechas son iguales");
            }

        } catch (ParseException e) {
//            throw new RuntimeException(e);
            System.err.println("Error, la fecha tiene un formato incorrecto " + e.getMessage());
            System.err.println("La fecha debe tener el formato 'dd-MM-yyyy'");
            // Se puede salir con exit()
            //            System.exit(1);
            // Volver a invocar el main
            main(args);
        }
    }
}
