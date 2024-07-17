package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T>listar(int desde, int hasta);
}
