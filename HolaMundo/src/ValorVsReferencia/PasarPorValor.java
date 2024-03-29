package ValorVsReferencia;

public class PasarPorValor {
    public static void main(String[] args) {
        // Las clases wrapper no son inmutables, por lo tanto no se puede reasignar el valor
        // Para solucionar esto se puede hacer con nuevas clases
        Integer i = 10;

        System.out.println("Iniciamos el metodo main con i = " + i);
        test(i);
        System.out.println("Terminamos el metodo main con i = " + i);
    }
    // static se puede invocar sin instanciar la clase
    // siempre se pasan datos de un objeto a otro mediante metodos
    public static void test(Integer variableI){
        System.out.println("Iniciamos el metodo test con variableI = " + variableI);
        variableI =35;
        System.out.println("Terminamos el metodo test con variableI = " + variableI);
    }
}
