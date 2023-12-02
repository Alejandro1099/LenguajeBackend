package hn.unah.backend.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class cliente {
    
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "correo")
    private String correo;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "contrasena")
    private String contrasena;

    //UN CLIENTE PUEDE TENER MUCHOS PEDIDOS
    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<pedidos> pedidos = new ArrayList<>();
}
