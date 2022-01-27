package com.jaimecosta.cursofullstack;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jaimecosta.cursofullstack.domain.Categoria;
import com.jaimecosta.cursofullstack.repositories.CategoriaRepository;

@SpringBootApplication
public class CursofullstackApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriarepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursofullstackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria (null, "Informática");
		Categoria cat2 = new Categoria (null, "Escritório");
		
		categoriarepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	

}
