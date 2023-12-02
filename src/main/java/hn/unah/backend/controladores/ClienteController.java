package hn.unah.backend.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.backend.modelos.cliente;
import hn.unah.backend.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crearCliente")
    public cliente crearCliente(@RequestBody cliente nvoCliente){
        return this.clienteServiceImpl.crearCliente(nvoCliente);
    }

    @GetMapping("/obtener/todos")
    public List<cliente> obtenerTodos(){
        return this.clienteServiceImpl.obtenerTodosClientes();
    }

    @DeleteMapping("/eliminar")
    public String eliminarClientexId(@RequestParam(name="idcliente") int idcliente){
        return this.clienteServiceImpl.eliminarClienteporId(idcliente);
    }

}
