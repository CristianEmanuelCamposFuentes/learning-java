package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio,
        OrdenableRepositorio, PaginableRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio(List<Cliente> dataSource) {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : dataSource) {
            if (cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void agregar(Cliente cliente) {
        dataSource.add(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        this.dataSource.remove(this.porId(id));
    }

    @Override
    public void actualizar(Cliente cliente) {
        Cliente cli = porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }


    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        dataSource.sort(( a,  b) -> {
                int resultado = 0;
                if (dir == Direccion.ASCENDENTE) {
                    switch (campo) {
                        case "id" -> resultado = a.getId().compareTo(b.getId());
                        case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
                        case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
                    }
                } else if (dir == Direccion.DESCENDENTE) {
                    switch (campo) {
                        case "id" -> resultado = b.getId().compareTo(a.getId());
                        case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());
                        case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
                    }
                }
                return resultado;
        });
        return dataSource;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


}
