package POO.Interfaces.CrudRepositorio.repositorio;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T>listar(int desde, int hasta);
}
