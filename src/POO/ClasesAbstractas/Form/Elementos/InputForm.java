package POO.ClasesAbstractas.Form.Elementos;

public class InputForm extends ElementoForm {
    private String tipo = "text";

    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    @Override
    public String dibujarHTML() {
        return "<input type='" + this.tipo
                + "' name='" + this.nombre
                + "' value=' "+ this.valor + ">";
    }
}
