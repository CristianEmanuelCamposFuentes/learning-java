package POO.ClasesAbstractas.Form.Elementos;

import POO.ClasesAbstractas.Form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {
    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElementoForm(){
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }
    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if (!v.esValido(this.valor)){
                this.errores.add(v.getMensaje());
            }
        }
        // Si no hay errores, el formulario es válido
        return this.errores.isEmpty();
    }

    abstract public String dibujarHTML();
}
