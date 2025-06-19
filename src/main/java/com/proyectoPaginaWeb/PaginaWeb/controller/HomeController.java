package com.proyectoPaginaWeb.PaginaWeb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "Diseñado para quienes no siguen huellas");
        return "index";
    }
}