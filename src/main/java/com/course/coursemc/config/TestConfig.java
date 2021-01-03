package com.course.coursemc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.course.coursemc.domain.Categoria;
import com.course.coursemc.repositories.CategoriaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(1, "Informática");
		Categoria cat2 = new Categoria(2, "Escritório");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));

	}

}
