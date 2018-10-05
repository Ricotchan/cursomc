package com.ikematsu.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikematsu.cursomc.domain.Pedido;
import com.ikematsu.cursomc.repositories.PedidoRepository;
import com.ikematsu.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	//ESSE CÓDIGO É FEITO PARA O SPRINGBOOT 2.0.0
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
				+ ", Tipo: " + Pedido.class.getName()));
	}
	
}
