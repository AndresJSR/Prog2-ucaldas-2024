package com.taller.app.services;

import java.util.List;

import com.taller.app.domain.Lenguaje;

public interface LenguajeService {
    public List<Lenguaje> listaLenguajes();
    public Lenguaje listaLenguajes(Lenguaje lenguaje);
}   
