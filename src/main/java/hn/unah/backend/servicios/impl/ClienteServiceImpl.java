package hn.unah.backend.servicios.impl;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import hn.unah.backend.modelos.cliente;
import hn.unah.backend.repositorios.ClienteRepository;
import hn.unah.backend.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository ClienteRepository;

    @Override
    public cliente crearCliente(cliente nvoCliente){
        return ClienteRepository.save(nvoCliente);
    }

    @Override
    public String eliminarClienteporId(int numeroCliente){
        cliente cteEliminar = this.ClienteRepository.findById(numeroCliente).get();

        if(cteEliminar != null){
            this.ClienteRepository.delete(cteEliminar);
            return "Se ha eliminado el cliente: " + cteEliminar.getIdcliente(); 
        }

        return "No existe el cliente con dni: " + numeroCliente;
    }

    @Override
    public List<cliente> obtenerTodosClientes(){
        return this.ClienteRepository.findAll();
    }
}