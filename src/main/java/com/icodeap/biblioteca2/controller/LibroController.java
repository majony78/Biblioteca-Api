package com.icodeap.biblioteca2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icodeap.biblioteca2.dto.LibroDTO;
import com.icodeap.biblioteca2.service.LibroService;

@RestController
@RequestMapping("/api/v1/biblioteca2/libros")
public class LibroController {

	@Autowired
	private LibroService libroService;

	@PostMapping
	public ResponseEntity<LibroDTO> save(@RequestBody LibroDTO libroDTO) {
		try {
			return new ResponseEntity<>(libroService.save(libroDTO), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping
	public ResponseEntity<List<LibroDTO>> findAll() {
		return new ResponseEntity<>(libroService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<LibroDTO> FindById(@PathVariable Integer id) {
		try {
			return new ResponseEntity<>(libroService.findById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable Integer id){
		try {
			libroService.delete(id);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	

}
