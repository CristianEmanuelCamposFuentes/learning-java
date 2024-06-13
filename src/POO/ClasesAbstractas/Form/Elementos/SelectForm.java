package POO.ClasesAbstractas.Form.Elementos;

import POO.ClasesAbstractas.Form.Elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion) {
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHTML() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>\n");
        for (Opcion opcion : this.opciones) {
            sb.append("<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()) {
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>\n");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
