package com.sv.appTrip.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sv.appTrip.appTest.service.ITripService;
import com.sv.appTrip.models.Trip;


@Controller
public class HomeController {

    @Autowired
    private ITripService tripService;

    @GetMapping("/")
    public String mostrarHome(Model model){
        List<Trip> lista = tripService.buscarTodos();
        model.addAttribute("trips", lista);
        
        return "home";

    }

    @GetMapping("/listado")
    public String mostrarListado (Model model){
        List<String> lista = new LinkedList<String>();

        lista.add("En la montaña");
        lista.add("En la ciudad");
        lista.add("En los pueblos");
        lista.add("En las montaña");

        model.addAttribute("listadoTrips", lista);

        return "listado";
    }

    //-----------------------------------------------------------------------

    @GetMapping("/detalle")
    public String mostrarDetalle (Model model){

        Trip trip = new Trip();
        trip.setNomTrip ("Rapel en volcatenango");
        trip.setDescripcion("Aventura rapel en el volcan");
        trip.setDate(new Date());
        trip.setCosto(10.0);

        model.addAttribute("trip", trip);

        return "detalle";
    }

    //-----------------------------------------------------------------

    private List<Trip> getTrips(){
        SimpleDateFormat sdf = new SimpleDateFormat ("dd-mm-yyy");
        List<Trip> lista = new LinkedList<>();

        try {

            Trip trip1 = new Trip();
            trip1.setId(1);
            trip1.setNomTrip("Excursión a las Cascadas de Joya de Cerén");
            trip1.setDescripcion("Disfruta de la belleza natural en Joya de Cerén");
            trip1.setDate(sdf.parse("20-09-2024"));
            trip1.setCosto(12.5);
            trip1.setDestacado(1);
            lista.add(trip1);
            trip1.setImagen("trip1.png");
            
            
    
            // Trip 2
            Trip trip2 = new Trip();
            trip2.setId(2);
            trip2.setNomTrip("Tour gastronómico en Suchitoto");
            trip2.setDescripcion("Explora la rica cocina local en Suchitoto");
            trip2.setDate(sdf.parse("25-09-2024"));
            trip2.setCosto(9.0);
            trip2.setDestacado(0);
            lista.add(trip2);
            trip2.setImagen("trip2.png");
            
    
            // Trip 3
            Trip trip3 = new Trip();
            trip3.setId(3);
            trip3.setNomTrip("Avistamiento de aves en El Imposible");
            trip3.setDescripcion("Observa la diversidad de avifauna en El Imposible");
            trip3.setDate(sdf.parse("30-09-2024"));
            trip3.setCosto(7.8);
            trip3.setDestacado(0);
            lista.add(trip3);
            trip3.setImagen("tirp3.png");
            
    
            // Trip 4 (Exploración de cuevas en Tazumal)
           
            Trip trip4 = new Trip();
            trip4.setId(4);
            trip4.setNomTrip("Recorrido histórico en Tazumal");
            trip4.setDescripcion("Descubre las ruinas mayas en Tazumal");
            trip4.setDate(sdf.parse("05-10-2024"));
            trip4.setCosto(6.2);
            trip4.setDestacado(1);
            lista.add(trip4);
            trip4.setImagen("no-image.png");
            
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

   

    @GetMapping("/tabla")
    public String mostrarTabla (Model model){
        List<Trip> lista = getTrips();
        model.addAttribute("trips", lista);
        return "tabla";
    }
    
}