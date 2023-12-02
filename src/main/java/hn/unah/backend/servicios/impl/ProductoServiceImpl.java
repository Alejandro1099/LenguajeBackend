package hn.unah.backend.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.backend.modelos.producto;
import hn.unah.backend.repositorios.ProductoRepository;
import hn.unah.backend.servicios.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;
    
    @Override
    public producto creaProducto(producto nvProducto){
        return productoRepository.save(nvProducto);
    }

    @Override
    public List<producto> obtenerTodosProductos(){
        return this.productoRepository.findAll();
    }

    @Override
    public String eliminarProductoporId(int numeroProducto){
        producto productoDelete = this.productoRepository.findById(numeroProducto).get();

        if(productoDelete != null){
            this.productoRepository.delete(productoDelete);
            return "Se ha eliminado el producto: " + productoDelete.getIdproducto(); 
        }

        return "No existe el producto con ese id de identificacion: " + numeroProducto;
    }
}
