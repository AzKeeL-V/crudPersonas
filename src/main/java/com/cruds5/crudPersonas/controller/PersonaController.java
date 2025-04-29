package com.cruds5.crudPersonas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//restcontroler = notaciones por eso lleva arroba
@RestController
@RequestMapping("/api/personas")

public class PersonaController {
    @GetMapping
    public String saludar(){
        return "hola el microservicio funciona";
    }
}
