package com.course.coursemc.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.course.coursemc.domain.Estado;
import com.course.coursemc.dto.CidadeDTO;
import com.course.coursemc.dto.EstadoDTO;
import com.course.coursemc.repositories.EstadoRepository;
import com.course.coursemc.services.CidadeService;

@RestController
@RequestMapping("/estados")
public class EstadoResource {

	@Autowired
	private EstadoRepository repository;

	@Autowired
	private CidadeService cidadeService;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@GetMapping
	public ResponseEntity<List<EstadoDTO>> findAllNome() {
		List<EstadoDTO> list = toCollection(repository.findAllByOrderByNome());
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}/cidades")
	public ResponseEntity<List<CidadeDTO>> findEstado(@PathVariable Integer id){
		List<CidadeDTO> list = cidadeService.findEstado(id).stream().map(x -> new CidadeDTO(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(list);
	}
	
	private List<EstadoDTO> toCollection(List<Estado> list){
		return list.stream().map(x -> modelMapper.map(x, EstadoDTO.class))
				.collect(Collectors.toList());
	}
}
