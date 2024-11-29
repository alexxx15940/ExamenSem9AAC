package com.proyCliente.proyCliente.service;

import java.util.List;

import com.proyCliente.proyCliente.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> verTodo();
	
	public Cliente guardar(Cliente cliente);
	
	
}
