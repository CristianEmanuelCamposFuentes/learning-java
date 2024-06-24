package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.List;

public interface CrudRepositorio {
    List<Cliente>listar();
    Cliente porId(Integer id);
    void crear(Cliente cliente);
    void eliminar(Integer id);
    void actualizar(Cliente cliente);
}
