package POO.ClasesAbstractas.Form.validador;

public class NumeroValidador extends Validador{
    protected String mensaje = "El campo debe ser un numero";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return valor.matches("[0-9]+");
    }
}
