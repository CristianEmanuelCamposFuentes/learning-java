package POO.Interfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {
    private String persona;
    private String carrera;
    private List<String> experiencias;
    public Curriculum(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum agregarExperiencia(String experiencia) {
        this.experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("CURRICULUM DE ").append(this.persona).append("\n");
        sb.append("CARRERA: ").append(this.carrera).append("\n");
        for (String experiencia : this.experiencias) {
            sb.append(experiencia).append("\n");
        }
        return sb.toString();
    }
}
