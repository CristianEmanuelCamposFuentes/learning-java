package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio {
    List<Cliente>listar(int desde, int hasta);
}
