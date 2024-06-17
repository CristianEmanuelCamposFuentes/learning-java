package POO.ClasesAbstractas.Form.Elementos.select;

public class Opcion {
    private String valor;
    private String nombre;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public Opcion setSelected() {
        this.selected = selected;
        return this;
    }
    public void setSelected(boolean selected) {
        this.selected = selected;
     }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
