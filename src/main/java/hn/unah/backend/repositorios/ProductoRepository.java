package hn.unah.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.backend.modelos.producto;

public interface ProductoRepository extends JpaRepository<producto, Integer> {
    
}
