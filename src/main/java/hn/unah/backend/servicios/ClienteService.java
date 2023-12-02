package hn.unah.backend.servicios;

import java.util.List;

import hn.unah.backend.modelos.cliente;

public interface ClienteService {
    
    public cliente crearCliente(cliente nvoCliente); //crea un nuevo cliente

    public String eliminarClienteporId(int numeroCliente);//elimina por id los clientes

    public List<cliente> obtenerTodosClientes(); //lista todos los clientes en la BD
}
