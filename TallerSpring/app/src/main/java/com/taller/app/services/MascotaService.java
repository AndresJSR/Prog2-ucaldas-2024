package com.taller.app.services;

import java.util.List;

import com.taller.app.domain.Mascota;

public interface MascotaService {
public List <Mascota> listaMascotas();
public Mascota listaMascotas(Mascota mascota);  
}
