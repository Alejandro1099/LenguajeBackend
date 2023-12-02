package hn.unah.backend.servicios;

import java.util.List;
import hn.unah.backend.modelos.motorista;


public interface MotoristaService {
    
    public motorista crearMotorista(motorista nvoMotorista);

    public List<motorista> obtenerTodosMotoristas();

    public String eliminarMotoristaporId(int numeroMotorista);
}
