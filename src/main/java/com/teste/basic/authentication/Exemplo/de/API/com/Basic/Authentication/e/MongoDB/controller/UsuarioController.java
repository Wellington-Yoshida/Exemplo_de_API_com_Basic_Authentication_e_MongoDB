package com.teste.basic.authentication.Exemplo.de.API.com.Basic.Authentication.e.MongoDB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class UsuarioController {

    @GetMapping(value = "/olaMundo")
    public String olaMundo() {
        return "Olá Mundo!";
    }
}
