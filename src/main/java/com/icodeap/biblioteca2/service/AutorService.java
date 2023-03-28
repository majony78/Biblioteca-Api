package com.icodeap.biblioteca2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icodeap.biblioteca2.dto.AutorDTO;
import com.icodeap.biblioteca2.repository.IAutorRepository;

@Service
public class AutorService {
	
	@Autowired
	private FabricaAutorService fabricaAutorService;
	
	@Autowired
	private IAutorRepository autorRepository;
	
	
	public AutorDTO save(AutorDTO autorDto) {
		return fabricaAutorService.crearAutorDto(autorRepository.save(fabricaAutorService.crearAutor(autorDto)));
	}
	
	public List<AutorDTO> findALL(){
		return fabricaAutorService.crearAutoresDto(autorRepository.findAll());
	}
	
	public AutorDTO findById(Integer id) {
		return fabricaAutorService.crearAutorDto(autorRepository.findById(id).get());
	}
	
	public void delete(Integer id) {
	   autorRepository.deleteById(id);
	}
	
	
	

}
