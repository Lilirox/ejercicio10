package com.curso.api.ejercicio10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.api.ejercicio10.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
