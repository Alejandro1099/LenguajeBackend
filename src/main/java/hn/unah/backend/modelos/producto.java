package hn.unah.backend.modelos;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;

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
@Table(name = "producto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class producto {
    
    @Id
    @Column(name = "idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idproducto;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "precio")
    private int precio;

    //relacion con el idcomercio
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "idcomercio", referencedColumnName = "idcomercio")
    private comercio comercio;

    //relacion con el pedido (Tabla intermedia detallpedido)
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<detallePedido> detallePedido = new ArrayList<>();
}
