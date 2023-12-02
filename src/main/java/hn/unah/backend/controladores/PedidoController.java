package hn.unah.backend.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import hn.unah.backend.servicios.impl.PedidoServiceImpl;
import hn.unah.backend.modelos.pedidos;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoServiceImpl pedidoServiceImpl;

    @GetMapping("/obtener/todos")
    public List<pedidos> obtenerTodos(){
        return this.pedidoServiceImpl.obtenerTodosPedidos();
    }

}
