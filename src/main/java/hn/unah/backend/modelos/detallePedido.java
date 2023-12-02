package hn.unah.backend.modelos;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "detallepedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class detallePedido {
    
    @Id
    @Column(name = "iddetalle")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int iddetalle;

    //relacion con el pedido
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idpedido", referencedColumnName = "idpedido")
    private pedidos pedido;

    //relacion con el producto
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idproducto", referencedColumnName = "idproducto")
    private producto producto;
}
