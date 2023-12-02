package hn.unah.backend.servicios;

import java.util.List;

import hn.unah.backend.modelos.detallePedido;

public interface DetallePedidoService {
    
    public List<detallePedido> obtenerTodosPedidos();//lista todos los detalles del pedido
}
