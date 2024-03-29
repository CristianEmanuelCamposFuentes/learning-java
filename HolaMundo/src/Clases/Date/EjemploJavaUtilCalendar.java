package Clases.Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
//        calendario.set(2020,0,25,18,0,15);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, 0);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 18);
        calendario.set(Calendar.MINUTE, 0);
        calendario.set(Calendar.SECOND, 15);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        Date fecha = calendario.getTime();
        System.out.println("Calendario =" + fecha);

        // Formatear
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy. 'Hora' HH:mm:ss a");
        // Formatea a string con .format()
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);
    }
}
