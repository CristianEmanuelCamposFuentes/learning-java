package POO.ClasesAbstractas.Form;

import POO.ClasesAbstractas.Form.Elementos.ElementoForm;
import POO.ClasesAbstractas.Form.Elementos.InputForm;
import POO.ClasesAbstractas.Form.Elementos.SelectForm;
import POO.ClasesAbstractas.Form.Elementos.TextareaForm;
import POO.ClasesAbstractas.Form.Elementos.select.Opcion;
import POO.ClasesAbstractas.Form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("password", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(4, 8));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguajes = new SelectForm("lenguajes");
        lenguajes.addValidador(new NoNuloValidador());
        Opcion java = new Opcion("1", "java");
        Opcion python = new Opcion("2", "python");
        Opcion typescript = new Opcion("6", "typescript").setSelected();
        lenguajes.addOpcion(java)
                .addOpcion(python)
                .addOpcion(new Opcion("3", "c++"))
                .addOpcion(new Opcion("4", "javascript"))
                .addOpcion(new Opcion("5", "php"))
                .addOpcion(typescript);

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='" + this.nombre + "' value='" + this.valor + "'>";
            }
        };

        saludar.setValor("Hola, este saludo esta deshabilitado !");

        username.setValor("tabakos");
        password.setValor("1234");
        email.setValor("email@ejemplo.com");
        edad.setValor("32");
        experiencia.setValor("10 anios con Desarrollo Backend Java");
        typescript.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguajes,
                saludar);


        elementos.forEach(e -> {
            System.out.println(e.dibujarHTML());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if (!e.esValido()){
                e.getErrores().forEach(System.out::println);
            }
        });
    }
}
