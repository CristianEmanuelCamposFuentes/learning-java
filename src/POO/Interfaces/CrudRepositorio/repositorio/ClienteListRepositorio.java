package POO.Interfaces.CrudRepositorio.repositorio;

import POO.Interfaces.CrudRepositorio.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements OrdenablePaginableCrudRepositorio {

    private List<Cliente> dataSource;

    public ClienteListRepositorio() {
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
            if (cli.getId() != null && cli.getId().equals(id)) {
                resultado = cli;
                break;
            }
        }
        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
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
        List<Cliente> listaOrdenada = new ArrayList<>(this.dataSource);
        listaOrdenada.sort((Cliente a, Cliente b) -> {
                    int resultado = 0;
                    if (dir == Direccion.ASCENDENTE) {
                        resultado = ordenar(campo,a, b);
                    } else if (dir == Direccion.DESCENDENTE) {
                        resultado = ordenar(campo,b, a);
                    }
                    return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    public static int ordenar(String campo, Cliente a, Cliente b) {
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int count() {
        return this.dataSource.size();
    }
}
