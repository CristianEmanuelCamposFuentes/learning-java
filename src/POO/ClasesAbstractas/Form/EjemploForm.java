package POO.ClasesAbstractas.Form;

import POO.ClasesAbstractas.Form.Elementos.ElementoForm;
import POO.ClasesAbstractas.Form.Elementos.InputForm;
import POO.ClasesAbstractas.Form.Elementos.SelectForm;
import POO.ClasesAbstractas.Form.Elementos.TextareaForm;
import POO.ClasesAbstractas.Form.Elementos.select.Opcion;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);
        SelectForm lenguajes = new SelectForm("lenguajes");
        Opcion java = new Opcion("1", "java");
        Opcion python = new Opcion("2", "python");
        lenguajes.addOpcion(java)
                .addOpcion(python)
                .addOpcion(new Opcion("3", "c++"))
                .addOpcion(new Opcion("4", "javascript"))
                .addOpcion(new Opcion("5", "php"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHTML() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };

        saludar.setValor("Hola, este saludo esta deshabilitado !");

        username.setValor("tabakos");
        password.setValor("1234");
        email.setValor("email@example.com");
        edad.setValor("32");
        experiencia.setValor("10 anios en el mundo de java, para varias empresas alrededor del mundo");
        java.setSelected(true);

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
    }
}
