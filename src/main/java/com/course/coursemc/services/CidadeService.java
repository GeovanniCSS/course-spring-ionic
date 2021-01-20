package com.course.coursemc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.coursemc.domain.Cidade;
import com.course.coursemc.domain.Estado;
import com.course.coursemc.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private EstadoService estadoService;

	@Autowired
	private CidadeRepository repository;

	public List<Cidade> findEstado(Integer id) {
		Estado estado = estadoService.find(id);
		return repository.findAllByEstadoId(estado.getId());
	}

}
