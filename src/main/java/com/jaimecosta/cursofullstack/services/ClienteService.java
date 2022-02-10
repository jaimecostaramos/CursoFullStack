package com.jaimecosta.cursofullstack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaimecosta.cursofullstack.domain.Cliente;
import com.jaimecosta.cursofullstack.repositories.ClienteRepository;
import com.jaimecosta.cursofullstack.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
			"Objeto não encontrado! Id:" + id + ", Tipo: " + Cliente.class.getName()));

	}
	
}
