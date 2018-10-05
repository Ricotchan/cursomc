package com.ikematsu.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikematsu.cursomc.domain.Cliente;
import com.ikematsu.cursomc.repositories.ClienteRepository;
import com.ikematsu.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService { 

	@Autowired
	private ClienteRepository repo;
	
	//ESSE CÓDIGO É FEITO PARA O SPRINGBOOT 2.0.0
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Cliente.class.getName()));
	}
	
}
