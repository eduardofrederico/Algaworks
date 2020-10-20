package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Eduardo Frederico");
		cliente1.setEmail("eduardofrederico@live.com");
		cliente1.setTelefone("+5534999990000");
		
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("João Eduardo");
		cliente2.setEmail("joaoeduardo@live.com");
		cliente2.setTelefone("+5516999991112");
		
		return Arrays.asList(cliente1, cliente2);
		//gdfgrdhfhdhg
		
	}

}
