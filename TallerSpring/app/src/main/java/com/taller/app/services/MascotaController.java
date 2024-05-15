package com.taller.app.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.taller.app.domain.Mascota;

import org.springframework.ui.Model;    
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MascotaController {
    @GetMapping("/mascotas")
    public String listarMascotas(Model model) {
        Mascota mascota1 = new Mascota();
        Mascota mascota2 = new Mascota();
        mascota1.setTipo_mascota("Perro");
        mascota1.setNombre("Zeus");
        mascota1.setEdad("2 años");
        mascota1.setSexo("Macho");
        mascota1.setNombre_clinica_veterinaria("U Caldas");
        mascota2.setTipo_mascota("Gato");
        mascota2.setNombre("Lucy");
        mascota2.setEdad("1 año");
        mascota2.setSexo("Hembra");
        mascota2.setNombre_clinica_veterinaria("U Caldas");
        ArrayList<Mascota> mascotas = new ArrayList<>();
        mascotas.add(mascota1);
        mascotas.add(mascota2);
        model.addAttribute("mascotasListAtributte", mascotas);
        return "list_mascotas"; 

    }
    
}
