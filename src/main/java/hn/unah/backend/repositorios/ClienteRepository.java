package hn.unah.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.backend.modelos.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Integer> {
    
}
