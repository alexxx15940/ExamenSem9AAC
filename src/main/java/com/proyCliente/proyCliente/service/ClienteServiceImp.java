package com.proyCliente.proyCliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyCliente.proyCliente.dao.ClienteDao;
import com.proyCliente.proyCliente.entity.Cliente;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	private ClienteDao clienteDao;
	
	
	@Override
	public List<Cliente> verTodo() {
		// TODO Auto-generated method stub
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDao.save(cliente);
	}

}
