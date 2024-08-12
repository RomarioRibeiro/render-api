package com.romario.render.domain.resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romario.render.domain.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	
	Cliente cliente1 = new Cliente(1, "Romario Ribeiro", 27);
	Cliente cliente2 = new Cliente(1, "Romario Ribeiro", 27);
	Cliente cliente3 = new Cliente(1, "Romario Ribeiro", 27);
	Cliente cliente4 = new Cliente(1, "Romario Ribeiro", 27);
	
	@GetMapping
	public List<Cliente> listar(Cliente cliente) {
		List<Cliente> list = new ArrayList<>();
		
			list.add(cliente1);
			list.add(cliente2);
			list.add(cliente3);
			list.add(cliente4);
		
		return list;
		
	}
	
}
