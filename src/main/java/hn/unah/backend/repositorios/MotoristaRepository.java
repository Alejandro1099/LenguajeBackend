package hn.unah.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import hn.unah.backend.modelos.motorista;

public interface MotoristaRepository extends JpaRepository<motorista, Integer> {
    
}
