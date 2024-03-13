package Strings;

public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Cristian Campos";

        String resultado = curso.concat(profesor);

        System.out.println(curso);
        System.out.println(profesor);
        System.out.println(resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c +" usando stream " +profesor;
        });

        System.out.println(resultado2);

        String resultadoReplace = curso.replace("Java", "Android");
        System.out.println(resultadoReplace);
    }
}
