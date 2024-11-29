package com.proyCliente.proyCliente.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyCliente.proyCliente.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{

}
