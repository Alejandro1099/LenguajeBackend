package hn.unah.backend.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import hn.unah.backend.modelos.motorista;
import hn.unah.backend.repositorios.MotoristaRepository;
import hn.unah.backend.servicios.MotoristaService;

@Service
public class MotoristaServiceImpl implements MotoristaService {
    
    @Autowired
    private MotoristaRepository MotoristaRepository;

    @Override
    public motorista crearMotorista(motorista nvMotorista){
        return MotoristaRepository.save(nvMotorista);
    }

    @Override
    public List<motorista> obtenerTodosMotoristas(){
        return this.MotoristaRepository.findAll();
    }

    @Override
    public String eliminarMotoristaporId(int numeroMotorista) {
        motorista motoristaDelete = this.MotoristaRepository.findById(numeroMotorista).get();

        if(motoristaDelete != null){
            this.MotoristaRepository.delete(motoristaDelete);
            return "Se ha eliminado el motorista con la id. " + motoristaDelete.getIdmotorista();
        }

        return "No existe este motorista que corresponda a esta Id:" + numeroMotorista;
    }

    
}
