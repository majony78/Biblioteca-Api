package com.icodeap.biblioteca2.dto;

import com.icodeap.biblioteca2.model.Autor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AutorDTO {
	
	private Integer id;
	private String nombres;
	private String apellidos;
	private String telefono;
	
	
	public AutorDTO(Autor autor) {
		this.id = autor.getId();
		this.nombres = autor.getNombres();
		this.apellidos = autor.getApellidos();
		this.telefono = autor.getTelefono();
	}

	
	
}
 