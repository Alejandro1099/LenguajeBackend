package hn.unah.backend.controladores;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

import hn.unah.backend.servicios.impl.MotoristaServiceImpl;
import hn.unah.backend.modelos.motorista;

@RestController
@RequestMapping("/api/motorista")
public class MotoristaController {
    
    @Autowired
    private MotoristaServiceImpl motoristaServiceImpl;

    @PostMapping("/crearMotorista")
    public motorista crearMotorista(@RequestBody motorista nvoMotorista){
        return this.motoristaServiceImpl.crearMotorista(nvoMotorista);
    }

    @GetMapping("/obtener/todos")
    public List<motorista> obtenerTodos(){
        return this.motoristaServiceImpl.obtenerTodosMotoristas();
    }

    @DeleteMapping("/eliminar")
    public String eliminarMotoristaxId(@RequestParam(name = "idmotorista")int idmotorista){
        return this.motoristaServiceImpl.eliminarMotoristaporId(idmotorista);
    }
}
