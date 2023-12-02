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
@Table(name = "comercio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class comercio {
    
    @Id
    @Column(name = "idcomercio")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idcomercio;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "longitud")
    private String longitud;

    @Column(name = "latitud")
    private String latitud;
    
    //Comercio con producto relacion 1 a muchos
    @OneToMany(mappedBy = "comercio", cascade = CascadeType.ALL)
    private List<producto> producto = new ArrayList<>();
}
