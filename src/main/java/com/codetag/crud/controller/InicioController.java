/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codetag.crud.controller;

import com.codetag.crud.servicio.ServicioEmpleadoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author CarlosColin
 */
@Controller
public class InicioController {
    @Autowired
    ServicioEmpleadoImpl serEmple;
    @RequestMapping("/")
    public String index(Model modelo)
    {
        modelo.addAttribute("saludo", "Esto es una prueba del springBoot");
        modelo.addAttribute("empleados",serEmple.lstAllEmpleados());
        return  "index";
    }
    
}
