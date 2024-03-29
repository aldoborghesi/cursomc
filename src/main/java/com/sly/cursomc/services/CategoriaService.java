package com.sly.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sly.cursomc.domain.Categoria;
import com.sly.cursomc.respositories.CategoriaRepository;
import com.sly.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	// Instanciar automaticamente
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objecto Nao Ecnontrado Id:" + id + 
				", Tipo: " + Categoria.class.getName()));
	}

}
