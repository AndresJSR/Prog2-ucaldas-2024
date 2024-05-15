package com.taller.app.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.taller.app.domain.Vehiculo;

import org.springframework.ui.Model;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VehiculoController {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/vehiculo")
    public String informacionVehiculo(Model model) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setTipo_vehiculo("Moto");
        vehiculo.setModelo("2015");
        vehiculo.setMarca("Yamaha");
        vehiculo.setColor("negra");
        model.addAttribute("vehiculoAtributtes", vehiculo);
        return "show_vehiculo";
    }
    @GetMapping("/vehiculos")
    public String listarVehiculos(Model model) {
        Vehiculo vehiculo1 = new Vehiculo(); 
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo1.setTipo_vehiculo("Moto");
        vehiculo1.setModelo("2015");
        vehiculo1.setMarca("Yamaha");
        vehiculo1.setColor("negra");
        vehiculo2.setTipo_vehiculo("Carro");
        vehiculo2.setModelo("2020");
        vehiculo2.setMarca("Mazda");
        vehiculo2.setColor("rojo");
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        model.addAttribute("vehiculosListAtributte", vehiculos);
        return "list_vehiculos";
    }
    
    
}
