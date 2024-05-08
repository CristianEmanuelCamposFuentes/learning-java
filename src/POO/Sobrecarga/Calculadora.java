package POO.Sobrecarga;

public class Calculadora {
    private Calculadora(){

    }
    public static int sumar(int a, int b){
        return a+b;
    }
    public static float sumar(float x, float y){
        return x+y;
    }

    public static float sumar(int i,float j){
        return i+j;
    }

    public static float sumar(float i, int j){
        return i+j;
    }

    public static double sumar(double i, double j){
        return i+j;
    }

    public static int sumar(String a, String b){
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
            resultado = 0;
        }
        return resultado;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }

    // Numero variable de argumentos
    public static int sumar(int... args){
        int resultado = 0;
        for (int i = 0; i < args.length; i++) {
            resultado += args[i];
        }
        return resultado;
    }

    public static long sumar(long a, int... args){
        long resultado = a;
        for (int i = 0; i < args.length; i++) {
            resultado += args[i];
        }
        return resultado;
    }
}
