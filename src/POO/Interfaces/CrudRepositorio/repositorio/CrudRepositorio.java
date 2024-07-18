package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.repositorio.excepciones.AccesoDatoException;
import POO.Interfaces.CrudRepositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import POO.Interfaces.CrudRepositorio.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {
    List<T>listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
}
