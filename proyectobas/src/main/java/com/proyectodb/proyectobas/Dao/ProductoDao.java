package com.proyectodb.proyectobas.Dao;

import com.proyectodb.proyectobas.Entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long>{ // Generics nos servir paa modifcar los valores,  identiifcar el id



        }

