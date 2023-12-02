package hn.unah.backend.modelos;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class pedidos {
    
    @Id
    @Column(name = "idpedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpedido;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "tarifa")
    private double tarifa;

    //relacion con un cliente, muchos pedidos a un cliente
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    private cliente cliente;

    //falta hacer relacion con el motorista
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idmotorista", referencedColumnName = "idmotorista")
    private motorista motorista;
    

    //Un pedido puede tener muchos productos
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<detallePedido> detallePedido = new ArrayList<>();
}
