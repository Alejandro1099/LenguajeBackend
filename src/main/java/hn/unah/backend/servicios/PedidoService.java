package hn.unah.backend.servicios;

import hn.unah.backend.modelos.pedidos;
import java.util.List;

public interface PedidoService {
    
    public pedidos crearPedidos(pedidos nvPedidos);//crea un pedido

    public List<pedidos> obtenerTodosPedidos();//obtener todos los pedidos
}
