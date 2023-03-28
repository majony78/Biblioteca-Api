package com.icodeap.biblioteca2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.icodeap.biblioteca2.dto.AutorDTO;
import com.icodeap.biblioteca2.model.Autor;

@Service
public class FabricaAutorService {
	
	public Autor crearAutor(AutorDTO autorDto) {
		return new Autor(autorDto);
	}
	
	public AutorDTO crearAutorDto(Autor autor) {
		return new AutorDTO(autor);
	}
	
	public List<AutorDTO> crearAutoresDto(List<Autor> autores){
		List<AutorDTO> autorDtos = new ArrayList<>();
		autores.stream().forEach(
             autor -> {
            	 autorDtos .add(crearAutorDto(autor));
             }
				
				);
		return autorDtos;
	}

}
