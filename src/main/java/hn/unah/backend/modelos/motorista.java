package hn.unah.backend.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "motorista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class motorista {
    
    @Id
    @Column(name = "idmotorista")
    private int idmotorista;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    //un motorista puede tener muchos pedidos
    @OneToMany(mappedBy = "motorista", cascade = CascadeType.ALL)
    private List<pedidos> pedidos = new ArrayList<>();
}
