package com.natalia.produtos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cursos")
public class CursoController {
	@GetMapping
	public String Curso() {
		return "teste";
	}
	
}
