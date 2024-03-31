package FlujosControl;

public class SentenciaForEach {

    public static void main(String[] args) {
        int[] numerosPrimos = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int num : numerosPrimos) {
            System.out.println(num);
        }

        String nombres[] = {"Juan", "Pedro", "Maria"};
        for (String nombre : nombres) {
            System.out.println("Hola " + nombre);
        }
    }
}
