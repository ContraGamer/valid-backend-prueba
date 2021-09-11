package com.prueba.valid.spring.Controller;

import java.time.LocalDateTime;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrincipalControlador {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("tstamp", LocalDateTime.now());
        return "index";
    }

    @GetMapping("/hello")
    public String showHello(Model model){
        model.addAttribute("saludo", "Mi primera aplicacion web Spring Boot");
        return "hello";
    }
    
}
