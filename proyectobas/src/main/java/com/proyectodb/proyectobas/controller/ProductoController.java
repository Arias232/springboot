package com.proyectodb.proyectobas.controller;

import com.proyectodb.proyectobas.Entity.Producto;
import com.proyectodb.proyectobas.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    ProductoService productoService;

    // Para consultas se utilizan los métodos GET
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Producto obtenerProducto(@PathVariable Long id) {
        return productoService.findById(id);
    }


@PostMapping()
    public void crearProducto(@RequestBody Producto producto){
    productoService.createProducto(producto);
}


@PutMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id, @RequestBody Producto producto){
    productoService.modifyProducto(id, producto);
}


@DeleteMapping(value = "/{id}")
    public void modificarProducto(@PathVariable Long id){
    productoService.deleteProducto(id);
}
}
