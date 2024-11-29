package com.proyCliente.proyCliente.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyCliente.proyCliente.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long>{

}
