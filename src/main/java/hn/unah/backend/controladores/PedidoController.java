package hn.unah.backend.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import hn.unah.backend.servicios.impl.PedidoServiceImpl;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import hn.unah.backend.modelos.pedidos;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoServiceImpl pedidoServiceImpl;

    @PostMapping("/crearPedido")
    private pedidos crearPedidos(@RequestBody pedidos nvoPedidos){
        return this.pedidoServiceImpl.crearPedidos(nvoPedidos);
    }

    @GetMapping("/obtener/todos")
    public List<pedidos> obtenerTodos(){
        return this.pedidoServiceImpl.obtenerTodosPedidos();
    }

}
