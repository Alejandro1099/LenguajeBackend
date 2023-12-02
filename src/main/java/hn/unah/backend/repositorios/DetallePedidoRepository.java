package hn.unah.backend.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.backend.modelos.detallePedido;

public interface DetallePedidoRepository extends JpaRepository<detallePedido, Integer> {
    
}
