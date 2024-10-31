
package com.example.EjercicioPractico1;

import java.util.List;


public class ProductService {
    public interface ProductoService {
    List<Producto> listarProductos();
    Producto guardarProducto(Producto producto);
    void eliminarProducto(Long id);
}
    
}
