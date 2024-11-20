package com.sv.appTrip.appTest.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sv.appTrip.models.Trip;
@Service
public class TripServiceImpl implements ITripService {

    List<Trip> lista = null;
    public TripServiceImpl(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        lista = new LinkedList<Trip>();
        
         try {

            Trip trip1 = new Trip();
            trip1.setId(1);
            trip1.setNomTrip("Rapel en Volcatenango");
            trip1.setDescripcion("Hacer rapel en los circuitos de volcatenango");
            trip1.setDate(sdf.parse("10-05-2022"));
            trip1.setCosto(5.0);
            trip1.setDestacado(1);
            trip1.setImagen("trip1.png");
            
            
    
            // Trip 2
            Trip trip2 = new Trip();
            trip2.setId(2);
            trip2.setNomTrip("Deslizadero en el picnic");
            trip2.setDescripcion("Deslizarte en un divertido tobogan sobre la colina");
            trip2.setDate(sdf.parse("10-05-2022"));
            trip2.setCosto(5.0);
            trip2.setDestacado(1);
            trip2.setImagen("trip2.png");
            
    
            // Trip 3
            Trip trip3 = new Trip();
            trip3.setId(3);
            trip3.setNomTrip("Comida y Flores");
            trip3.setDescripcion("Disfrutar de un amplio jardin en el cual podras comprar");
            trip3.setDate(sdf.parse("10-05-2022"));
            trip3.setCosto(1.0);
            trip3.setDestacado(1);
            trip3.setImagen("tirp3.png");
            
    
            // Trip 4 (Exploración de cuevas en Tazumal)
           
            Trip trip4 = new Trip();
            trip4.setId(4);
            trip4.setNomTrip("Caminatas");
            trip4.setDescripcion("Disfruta de hacer senderismo por las montañas de chalatenango...");
            trip4.setDate(sdf.parse("01-02-2022"));
            trip4.setCosto(1.0);
            trip4.setDestacado(0);
            trip4.setImagen("no-image.png");

            lista.add(trip1);
            lista.add(trip2);
            lista.add(trip3);
            lista.add(trip4);
            
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public List<Trip> buscarTodos() {
        
        return lista;
    }
    @Override
    public Trip buscarPorId(Integer idTrip) {
        for (Trip trip : lista)
            if(trip.getId()==idTrip)
                return trip;
        return null;
        
    }

    @Override
    public void guardar(Trip trip) {
        lista.add(trip);
    }


    
    
}
