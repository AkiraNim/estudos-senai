package com.example.demo.application;

import com.example.demo.controllers.requests.UsuarioRequest;
import com.example.demo.entities.Papel;
import com.example.demo.entities.Usuario;
import com.example.demo.repositories.PapelRepository;
import com.example.demo.repositories.UsuarioRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class UsuarioApplication {
    private final UsuarioRepository usuarioRepository;
    private final PapelRepository papelRepository;

    private BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public UsuarioApplication(UsuarioRepository usuarioRepository, PapelRepository papelRepository) {
        this.usuarioRepository = usuarioRepository;
        this.papelRepository = papelRepository;
    }

    public void cadastrar(UsuarioRequest usuarioRequest) {
        Usuario usuario = new Usuario(
                usuarioRequest.getNome(),
                usuarioRequest.getUsuario(),
                usuarioRequest.getSenha());

        usuario.setSenha("{bcrypt}" + bCryptPasswordEncoder.encode(usuario.getSenha()));

        this.usuarioRepository.save(usuario);

        Papel papel = new Papel();
        papel.setPapel("ROLE_"+usuarioRequest.getPapel());
        papel.setUsuarioId(usuario.getId());

        this.papelRepository.save(papel);
    }
}
