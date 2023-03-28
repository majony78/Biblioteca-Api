package com.icodeap.biblioteca2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.icodeap.biblioteca2.dto.LibroDTO;
import com.icodeap.biblioteca2.model.Libro;

@Service
public class FabricaLibroService {

	public Libro crearLibro(LibroDTO libroDto) {
		return new Libro(libroDto);
	}

	public LibroDTO crearLibroDto(Libro libro) {
		return new LibroDTO(libro);
	}

	public List<LibroDTO> crearLibrosDto(List<Libro> libros) {
		List<LibroDTO> librosDto = new ArrayList<>();

		libros.stream().forEach(libro -> {
			librosDto.add(new LibroDTO(libro));

		}

		);

		return librosDto;
	}

}
