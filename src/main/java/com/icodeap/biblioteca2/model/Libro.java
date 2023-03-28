package com.icodeap.biblioteca2.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.icodeap.biblioteca2.dto.LibroDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String isbn;
	private String nombre;
	private String editorial;
	private String genero;
	private int numeroPaginas;
	private BigDecimal precio;
	private LocalDate fechaEdicion;
	@ManyToOne
	private Autor autor;
	
	
	
	
	
	public Libro(LibroDTO libroDto) {
		this.id = libroDto.getId();
		this.isbn = libroDto.getIsbn();
		this.nombre = libroDto.getNombre();
		this.editorial = libroDto.getEditorial();
		this.genero = libroDto.getGenero();
		this.numeroPaginas = libroDto.getNumeroPaginas();
		this.precio = libroDto.getPrecio();
		this.fechaEdicion = libroDto.getFechaEdicion();
		this.autor = new Autor(libroDto.getAutorDto());
	}
	
	
	

}
