package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo, Direccion dir);
}
