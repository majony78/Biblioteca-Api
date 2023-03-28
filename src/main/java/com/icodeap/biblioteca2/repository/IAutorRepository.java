package com.icodeap.biblioteca2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icodeap.biblioteca2.model.Autor;

@Repository
public interface IAutorRepository extends JpaRepository<Autor, Integer>{

	
	
}
