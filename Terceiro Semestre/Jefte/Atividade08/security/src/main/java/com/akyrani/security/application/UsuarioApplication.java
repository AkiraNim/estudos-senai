package com.akyrani.security.application;

import com.akyrani.security.entities.Usuario;
import com.akyrani.security.repositories.UsuarioRepositoryJPA;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UsuarioApplication {
    private UsuarioRepositoryJPA usuarioRepositoryJPA;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public UsuarioApplication(UsuarioRepositoryJPA usuarioRepositoryJPA) {
        this.usuarioRepositoryJPA = usuarioRepositoryJPA;
    }

    public void cadastrarUsuario(Usuario usuario){
        usuario.setSenha("{bcrypt}" + bCryptPasswordEncoder.encode(usuario.getSenha()));
        usuarioRepositoryJPA.save(usuario);
    }
}
