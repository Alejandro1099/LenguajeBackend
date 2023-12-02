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

import hn.unah.backend.modelos.comercio;
import hn.unah.backend.servicios.impl.ComercioServiceImpl;

@RestController
@RequestMapping("/api/comercio")
public class ComercioController {
    
    @Autowired
    private ComercioServiceImpl comercioServiceImpl;

    @PostMapping("/crearComercio")
    public comercio crearComercio(@RequestBody comercio nvoComerico){
        return this.comercioServiceImpl.crearComercio(nvoComerico);
    }

    @GetMapping("/obtener/todos")
    public List<comercio> obtenerTodos(){
        return this.comercioServiceImpl.obtenerTodosComercios();
    }

    @DeleteMapping("/eliminar")
    public String eliminarComercioxId(@RequestParam(name = "idcomercio")int idcomercio){
        return this.comercioServiceImpl.eliminarComercioporId(idcomercio);
    }
}
