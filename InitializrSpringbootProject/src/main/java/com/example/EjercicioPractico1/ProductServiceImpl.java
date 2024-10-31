
package com.example.EjercicioPractico1;

import com.example.EjercicioPractico1.ProductService.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class ProductServiceImpl {
    @Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
    
}
