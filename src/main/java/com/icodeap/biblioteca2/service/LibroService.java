package com.icodeap.biblioteca2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icodeap.biblioteca2.dto.LibroDTO;
import com.icodeap.biblioteca2.model.Autor;
import com.icodeap.biblioteca2.repository.IAutorRepository;
import com.icodeap.biblioteca2.repository.ILibroRepository;

@Service
public class LibroService {

	@Autowired
	private FabricaLibroService fabricaLibroService;
	@Autowired
	private ILibroRepository libroRepository;
	@Autowired
	private FabricaAutorService fabricaAutorService;
	@Autowired
	private IAutorRepository autorRepository;

	public LibroDTO save(LibroDTO libroDto) {
		//buscar autor
		Autor autor = autorRepository.findById(libroDto.getIdAutor()).get();
		libroDto.setAutorDto(fabricaAutorService.crearAutorDto(autor));
		
		return fabricaLibroService.crearLibroDto(libroRepository.save(fabricaLibroService.crearLibro(libroDto)));
	}

	public List<LibroDTO> findAll() {
		return fabricaLibroService.crearLibrosDto(libroRepository.findAll());
	}

	public LibroDTO findById(Integer id) {
		return fabricaLibroService.crearLibroDto(libroRepository.findById(id).get());
	}

	public void delete(Integer id) {
		libroRepository.deleteById(id);
	}

}
