package com.icodeap.biblioteca2.model;

import com.icodeap.biblioteca2.dto.AutorDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "autores")
public class Autor {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombres;
	private String apellidos;
	private String telefono;
	
	
	
	public Autor(AutorDTO autorDto) {
		this.id = autorDto.getId();
		this.nombres = autorDto.getNombres();
		this.apellidos = autorDto.getApellidos();
		this.telefono = autorDto.getTelefono();
	}
	
	
	
	

}


