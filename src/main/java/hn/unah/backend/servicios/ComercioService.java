package hn.unah.backend.servicios;

import hn.unah.backend.modelos.comercio;
import java.util.List;

public interface ComercioService {
    
    public comercio crearComercio(comercio nvComercio);//crea un nuevo comercio

    public List<comercio> obtenerTodosComercios();

    public String eliminarComercioporId(int numeroComercio);
}
