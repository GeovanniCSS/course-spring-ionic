package com.course.coursemc.dto;

import java.io.Serializable;

import com.course.coursemc.domain.Cidade;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;

	public CidadeDTO(Cidade entity) {
		super();
		this.nome = entity.getNome();
	}
	
	
}
