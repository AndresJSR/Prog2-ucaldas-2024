package com.example.darkcode.app.services;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.GetMapping;

import com.example.darkcode.app.domain.Employee;

import org.springframework.ui.Model;
import java.util.ArrayList;

@Controller
public class EmployeeController {
    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/saludo")
    public String saludo(Model model) {
        model.addAttribute("Mensaje", "Hola desde vista");
        return "Saludo";
    }
    @GetMapping("/employee")
    public String informacionEmpleado(Model model) {
        Employee employee = new Employee();
        employee.setFullname("Andrés Sánchez");
        employee.setUser_email("andres@gmail.com");
        model.addAttribute("employeeAtributtes",employee);
        return "show_employee";
    }
    @GetMapping("/employees")
    public String listarEmpleados(Model model) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        employee1.setFullname("Juan Felipe");
        employee1.setUser_email("juanfelipe@gmail.com");
        employee2.setFullname("Juan");
        employee2.setUser_email("Juan@gmail.com");
        ArrayList<Employee> empleados = new ArrayList<>(); 
        empleados.add(employee1);
        empleados.add(employee2);
        model.addAttribute("employeeListAtributte", empleados);
        return "list_employees";
    }
    
}
