package com.curso.api.ejercicio10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.api.ejercicio10.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}
