package ValorVsReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        // Las clases wrapper no son inmutables, por lo tanto no se puede reasignar el valor
        // Para solucionar esto se puede hacer con nuevas clases
        int[] edad = {10,11,12};

        System.out.println("Iniciamos el metodo main con i. ");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Antes de llegar al metodo test. ");
        test(edad);
        System.out.println("Despues de llegar al metodo test. ");
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Edad[" + i + "] = " + edad[i]);
        }
        System.out.println("Finalizando el metodo main. ");
    }
    // static se puede invocar sin instanciar la clase
    // siempre se pasan datos de un objeto a otro mediante metodos
    public static void test(int[] edadArr){
        System.out.println("Iniciamos el metodo test ");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
        }
        System.out.println("Terminamos el metodo test ");
    }
}
