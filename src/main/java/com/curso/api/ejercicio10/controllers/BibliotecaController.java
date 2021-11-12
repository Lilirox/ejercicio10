package com.curso.api.ejercicio10.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.api.ejercicio10.entities.Libro;
import com.curso.api.ejercicio10.entities.Prestamo;
import com.curso.api.ejercicio10.entities.Usuario;
import com.curso.api.ejercicio10.repository.LibroRepository;
import com.curso.api.ejercicio10.repository.PrestamoRepository;
import com.curso.api.ejercicio10.repository.UsuarioRepository;

@RestController
public class BibliotecaController {

	@Autowired
	LibroRepository libroR;
	
	@Autowired 
	UsuarioRepository usuarioR;
	
	@Autowired
	PrestamoRepository prestamoR;
	
	// LIBROS
		@RequestMapping(value="/libros/", method=RequestMethod.GET)
		public List<Libro> getLibros(){
			
			return libroR.findAll();
		}
		
		@RequestMapping(value="/libros/{id}", method = RequestMethod.GET)
		public Libro getLibro(@PathVariable("id") int id) {
			return libroR.findById(id).get();
		}
		
		@RequestMapping(value="/libros/", method = RequestMethod.POST)
		public Libro createLibro(@RequestBody Libro libro) {
			return libroR.save(libro);
		}
		
		@RequestMapping(value="/libros/", method = RequestMethod.PUT)
		public Libro updateLibro(@RequestBody Libro libro) {
			return libroR.save(libro);
			
		}
		
		@RequestMapping(value="/libros/{id}", method = RequestMethod.DELETE)
		public void deleteLibro(@PathVariable("id") int id) {
			libroR.deleteById(id);
		}
		
		// USUARIOS
		@RequestMapping(value="/usuarios/", method=RequestMethod.GET)
		public List<Usuario> getUsuarios(){
			
			return usuarioR.findAll();
		}
		
		@RequestMapping(value="/usuarios/{id}", method = RequestMethod.GET)
		public Usuario getUsuario(@PathVariable("id") int id) {
			return usuarioR.findById(id).get();
		}
		
		@RequestMapping(value="/usuarios/", method = RequestMethod.POST)
		public Usuario createUsuario(@RequestBody Usuario usuario) {
			return usuarioR.save(usuario);
		}
		
		@RequestMapping(value="/usuarios/", method = RequestMethod.PUT)
		public Usuario updateUsuario(@RequestBody Usuario usuario) {
			return usuarioR.save(usuario);
			
		}
		
		@RequestMapping(value="/usuarios/{id}", method = RequestMethod.DELETE)
		public void deleteUsuario(@PathVariable("id") int id) {
			usuarioR.deleteById(id);
		}

		
		// PRESTAMOS
		@RequestMapping(value="/prestamos/", method=RequestMethod.GET)
		public List<Prestamo> getPrestamos(){
			
			return prestamoR.findAll();
		}
		
		@RequestMapping(value="/prestamos/{id}", method = RequestMethod.GET)
		public Prestamo getPrestamo(@PathVariable("id") int id) {
			return prestamoR.findById(id).get();
		}
		
		@RequestMapping(value="/prestamos/", method = RequestMethod.POST)
		public Prestamo createPrestamo(@RequestBody Prestamo prestamo) {
			return prestamoR.save(prestamo);
		}
		
		@RequestMapping(value="/prestamos/", method = RequestMethod.PUT)
		public Prestamo updatePrestamo(@RequestBody Prestamo prestamo) {
			return prestamoR.save(prestamo);
			
		}
		
		@RequestMapping(value="/prestamos/{id}", method = RequestMethod.DELETE)
		public void deletePrestamo(@PathVariable("id") int id) {
			prestamoR.deleteById(id);
		}
		
		
		
}
