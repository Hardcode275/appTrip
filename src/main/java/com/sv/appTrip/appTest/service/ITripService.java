package com.sv.appTrip.appTest.service;


import java.util.List;

import com.sv.appTrip.models.Trip;

public interface ITripService {

    List<Trip> buscarTodos();
    Trip buscarPorId(Integer idTrip);

    void guardar(Trip trip);

}
