package com.taller.app.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.taller.app.domain.Lenguaje;

import org.springframework.ui.Model;
import java.util.ArrayList;


@Controller
public class LenguajeController {

    @GetMapping("/lenguajes")
    public String listarLenguajes(Model model) {
        Lenguaje lenguaje1 = new Lenguaje();        
        Lenguaje lenguaje2 = new Lenguaje();        
        lenguaje1.setLenguaje("Java");
        lenguaje1.setFrameworks("Java Spring Framework ");
        lenguaje1.setTipo_paradigma("POO");
        lenguaje2.setLenguaje("Python");
        lenguaje2.setFrameworks("Django");
        lenguaje2.setTipo_paradigma("POO");
        ArrayList<Lenguaje> lenguajes = new ArrayList<>();
        lenguajes.add(lenguaje1);
        lenguajes.add(lenguaje2);
        model.addAttribute("lenguajesListAtributte", lenguajes);
        return "list_lenguajes";
    }
    
    
}
