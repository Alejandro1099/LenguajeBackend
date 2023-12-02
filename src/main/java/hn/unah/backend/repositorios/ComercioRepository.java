package hn.unah.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.backend.modelos.comercio;

public interface ComercioRepository extends JpaRepository<comercio, Integer> {
    
}
