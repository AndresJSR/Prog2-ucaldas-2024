package com.taller.app.services;

import java.util.List;

import com.taller.app.domain.Vehiculo;

public interface VehiculoService {
    public List<Vehiculo> listaVehiculos();
    public Vehiculo listaVehiculos(Vehiculo vehiculo);
}

    