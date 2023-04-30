package com.proyectodb.proyectobas.services;

import com.proyectodb.proyectobas.Dao.ProductoDao;
import com.proyectodb.proyectobas.Entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoDao productoDao;
    @Override
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll(); //Invoca al productoDao nos sirve para listar todos los productos
    }
    @Override
    public Producto findById(Long id) {

        return productoDao.findById(id).orElse(null); // Tiene el método findbyId si no existe que devuelva lo que esta dentro del parentisis
    }
    @Override
    public void createProducto(Producto producto) {
        productoDao.save(producto);

    }
    @Override
    public void modifyProducto(Long id, Producto producto) {
        if (productoDao.existsById(id)) {
            producto.setId(id);
            productoDao.save(producto);
        }
    }

    @Override
    public void deleteProducto(Long id) {
        if (productoDao.existsById(id)) {
            productoDao.deleteById(id);
        }
    }
}











// Tipo de dato que es el Id en este caso es Log
