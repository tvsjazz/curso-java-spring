package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/somar/{num1}/{num2}")
	public String somar(@PathVariable int num1, @PathVariable int num2) {
		int resultado = num1 + num2;
		return "O resultado da soma é: " + resultado;
	}
	
	@GetMapping("/subtrair ")
	public String subtrair(@RequestParam(name="a") int num1, @RequestParam(name="b") int num2) {
		int resultado = num1 - num2;
		return "O resultado da subtração é: " + resultado;
	}

}
