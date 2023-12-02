package hn.unah.backend.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import hn.unah.backend.modelos.pedidos;
import hn.unah.backend.repositorios.PedidosRepository;
import hn.unah.backend.servicios.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
    
    @Autowired
    private PedidosRepository pedidosRepository;

    @Override
    public pedidos crearPedidos(pedidos nvoPedidos){
        return pedidosRepository.save(nvoPedidos);
    }

    @Override
    public List<pedidos> obtenerTodosPedidos(){
        return this.pedidosRepository.findAll();
    }
}
