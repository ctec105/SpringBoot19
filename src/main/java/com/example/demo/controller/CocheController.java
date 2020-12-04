package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Coche;
import com.example.demo.service.ICocheService;

@Controller
public class CocheController {

	@Autowired
	private ICocheService cocheService;

	@GetMapping("/marcasform")
	public String form(Model model) {
		model.addAttribute("coche", new Coche());
		return "marcasform";
	}

	@PostMapping("/marca")
	public String buscarPorMarca(@RequestParam String marca, Model model, @ModelAttribute("coche") Coche coche) {
		model.addAttribute("coches", cocheService.buscarPorMarca(marca));
		return "marcasform";
	}

	@GetMapping("/modeloform")
	public String formModeo(Model model) {
		model.addAttribute("coche", new Coche());
		return "modeloform";
	}

	@PostMapping("/modelo")
	public String buscarPorModelo(@RequestParam String modelo, Model model, @ModelAttribute("coche") Coche coche) {
		model.addAttribute("coches", cocheService.buscarPorModelo(modelo));
		return "modeloform";
	}

	
	
	@GetMapping("/precioform")
	public String formprecio(Model model) {
		model.addAttribute("coche", new Coche());
		return "precioform";
	}

	@PostMapping("/precio")
	public String buscarPorRangoPrecio(@RequestParam(value = "precio", required = false) Double precio, Model model, @ModelAttribute("coche") Coche coche) {
		model.addAttribute("coches", cocheService.buscarPorPrecio(precio));
		return "precioform";
	}
}
