package com.sv.appTrip.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sv.appTrip.appTest.service.ITripService;
import com.sv.appTrip.models.Trip;


@Controller
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private ITripService serviceTrip;


   
    @GetMapping("/view/{id}")
    public String verDetalle(@PathVariable("id") int idTrip, Model model) {
        
        Trip trip = serviceTrip.buscarPorId(idTrip);
        System.out.println("idTrip" + trip.getId());
        model.addAttribute("trip", trip);
        return "detalle";
    }

    @GetMapping("/delete")
    public String eliminar(@RequestParam("id") int idTrip, Model model){
        System.out.println("idTrip es " + idTrip);
        model.addAttribute("id", idTrip);

        return "mensaje";

    }

    @GetMapping("/create")
	public String crear(Model model) {
        model.addAttribute("trip", new Trip());
		return"formTrip";
				
	}

    

    @PostMapping("/save")
    public String guardar(Trip trip, BindingResult result, RedirectAttributes attributes){
        if(result.hasErrors()){
            for(ObjectError error: result.getAllErrors()){
                System.out.println(error.getDefaultMessage());
            }
            return "formTrip";
        }

        serviceTrip.guardar(trip);
        attributes.addFlashAttribute("msg", "Registro Gurdado");
        System.out.println("Trip: " + trip);
        
        return "redirect:/categorias/index";
    }

    @InitBinder
public void initBinder(WebDataBinder webDataBinder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
}

    

    /*@GetMapping("/save/{titulo}")
    public String guardar(@PathVariable("titulo") String tituloTmp) {
        System.out.println("Titulo: " + tituloTmp);
        return "detalle";
    }*/
}

