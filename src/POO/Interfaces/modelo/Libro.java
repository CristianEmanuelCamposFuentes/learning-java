package POO.Interfaces.modelo;

import java.util.List;

public class Libro {
    private List<Hoja> paginas;
    private String autor;
    private String titulo;
    private Genero genero;

    public Libro(String titulo, Genero genero, String autor) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
    }

    public Libro addPagina(Hoja hoja) {
        this.paginas.add(hoja);
        return this;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("LIBRO: ").append(this.titulo).append("\n")
                .append("AUTOR: ").append(this.autor).append("\n")
                .append("GENERO: ").append(this.genero).append("\n")
                .append("PAGINAS: ").append(this.paginas.size()).append("\n");
        // Agregar las paginas
        for (Hoja hoja : this.paginas) {
            sb.append(hoja.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
