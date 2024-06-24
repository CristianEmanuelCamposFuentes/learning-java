package POO.Interfaces.Imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {
    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor,String titulo, Genero genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible hoja) {
        this.paginas.add(hoja);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("LIBRO: ").append(this.titulo).append("\n")
                .append("AUTOR: ").append(this.autor).append("\n")
                .append("GENERO: ").append(this.genero).append("\n")
                .append("PAGINAS: ").append(this.paginas.size()).append("\n");
        // Agregar las paginas
        for (Imprimible hoja : this.paginas) {
            sb.append(hoja.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
