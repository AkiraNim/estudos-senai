package com.akyrani.security.repositories;

import com.akyrani.security.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoryJPA extends JpaRepository<Usuario, Integer> {
}
