package br.edu.unipampa.jonas.chagas.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assessment")
public class AssessmentRest {
	
	@GetMapping
	public String buscar() {
		return "Primeiro Endpoint";
	}

}
