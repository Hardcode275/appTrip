package com.sv.appTrip.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value="/categorias")
public class categoriaTripController {
	
	@GetMapping("/index")
	public String mostrarIndex() {
		return "index";
		
	}
	
	
	/*@GetMapping("/create")
	public String crear() {
		return"formTrip";
				
	}*/
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion) {
		System.out.println("Nombre categoria:" + nombre);
		System.out.println("descripcion:" + descripcion);
		return "listcategorias";
		
	
	}
	
	/*@GetMapping("trips/view/{id}")
	public String mostrarDetalle(@PathVariable("id")int idTrip)
	{
			System.out.println("EL ID trip es:" + idTrip);	
			return "detalle";
	
	} */
	 
	
	
	

}
