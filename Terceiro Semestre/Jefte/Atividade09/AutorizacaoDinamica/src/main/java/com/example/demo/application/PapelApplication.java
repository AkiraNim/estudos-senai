package com.example.demo.application;

import com.example.demo.entities.Usuario;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PapelApplication {
    private final UsuarioRepository usuarioRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public PapelApplication(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void cadastrar(Usuario usuario) {
        usuario.setSenha("{bcrypt}" + bCryptPasswordEncoder.encode(usuario.getSenha()));

        this.usuarioRepository.save(usuario);
    }
}
