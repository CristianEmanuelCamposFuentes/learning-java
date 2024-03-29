package Clases.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("Fecha actual: " + fecha);

        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy. 'Hora' HH:mm:ss");
        // Formatea a string con .format()
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha formateada: " + fechaFormateada);

        long j = 0;
        for (int i = 0; i < 1000000000; i++) {
            j+=i;
        }
        System.out.println("j = " + j);


        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for: " + tiempoFinal);
        System.out.println("fechaFormateada = " + fechaFormateada);
    }
}
