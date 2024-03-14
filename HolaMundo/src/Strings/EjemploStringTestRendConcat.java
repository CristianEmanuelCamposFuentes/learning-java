package Strings;

public class EjemploStringTestRendConcat {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
//            c = c.concat(a).concat(b).concat("\n"); // 2 ms
//            c += a + b + "\n"; // 19 ms

            sb.append(a); // 0 ms
            sb.append(b);
            sb.append("\n");

        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de ejecucion: " + (fin - inicio) + " milisegundos");
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
