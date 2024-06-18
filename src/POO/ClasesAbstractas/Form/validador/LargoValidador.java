package POO.ClasesAbstractas.Form.validador;

public class LargoValidador extends Validador{

    protected String mensaje = "El campo debe tener un minimo de %d caracteres y un maximo de %d caracteres";
    private int minimo;
    private int maximo = Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

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
        this.mensaje =String.format(this.mensaje, this.minimo, this.maximo);
        if (valor == null){
            return true;
        }
        int largo = valor.length();
        return (largo >= this.minimo && largo <= this.maximo);
    }
}
