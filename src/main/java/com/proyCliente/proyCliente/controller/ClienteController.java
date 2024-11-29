package com.proyCliente.proyCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyCliente.proyCliente.entity.Cliente;
import com.proyCliente.proyCliente.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	private ClienteService a;
	
	@PostMapping("/registrar")
	public Cliente guardar(@RequestBody Cliente x) {
		return a.guardar(x);
	}
	
	@GetMapping("/verTodo")
	public List<Cliente> listar(){
		return a.verTodo();
	}
}
