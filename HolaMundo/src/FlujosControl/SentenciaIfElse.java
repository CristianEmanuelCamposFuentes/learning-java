package FlujosControl;

public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 1.8f;

        if (promedio >= 8.0f) {
            System.out.println("Excelente felicitaciones!");
        } else if (promedio >= 6.0f) {
            System.out.println("Aprobado.");
        } else if(promedio >= 4.0f) {
            System.out.println("Regular. Inténtalo de nuevo.");
        } else if (promedio >= 2.0f) {
            System.out.println("Desaprobado!");
        } else {
            System.out.println("Por favor, comunica tu situación con los padres.");
        }

        System.out.println("La nota es: " + promedio);
    }
}
