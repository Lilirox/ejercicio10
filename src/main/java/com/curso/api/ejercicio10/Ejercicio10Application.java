package com.curso.api.ejercicio10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.curso.api.ejercicio10.controllers.BibliotecaController;


@SpringBootApplication
@ComponentScan(basePackageClasses = BibliotecaController.class)
public class Ejercicio10Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio10Application.class, args);
	}

}
