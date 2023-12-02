package hn.unah.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.backend.modelos.pedidos;

public interface PedidosRepository extends JpaRepository<pedidos, Integer> {
    
}
