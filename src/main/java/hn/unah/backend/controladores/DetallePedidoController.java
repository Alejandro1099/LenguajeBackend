package hn.unah.backend.controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.backend.modelos.detallePedido;
import hn.unah.backend.servicios.impl.DetallePedidoServiceImpl;

@RestController
@RequestMapping("/api/detallePedido")
public class DetallePedidoController {
    
    private DetallePedidoServiceImpl detalleImpl;

    @GetMapping("/obtener/todosDetalles")
    public List<detallePedido> obtenerTodos(){
        return this.detalleImpl.obtenerTodosPedidos();
    }
}
