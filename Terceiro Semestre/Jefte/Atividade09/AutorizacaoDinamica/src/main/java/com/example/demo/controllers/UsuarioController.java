package com.example.demo.controllers;

import com.example.demo.application.UsuarioApplication;
import com.example.demo.controllers.requests.UsuarioRequest;
import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UsuarioApplication usuarioApplication;

    public UsuarioController(UsuarioApplication usuarioApplication) {
        this.usuarioApplication = usuarioApplication;
    }

    @PostMapping("/")
    public void cadastrar(@RequestBody UsuarioRequest usuarioRequest) {

        this.usuarioApplication.cadastrar(usuarioRequest);
    }
}
