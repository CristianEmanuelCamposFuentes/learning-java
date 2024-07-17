package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T>listar();
    T porId(Integer id);
    void crear(T cliente);
    void eliminar(Integer id);
    void actualizar(T cliente);
}
