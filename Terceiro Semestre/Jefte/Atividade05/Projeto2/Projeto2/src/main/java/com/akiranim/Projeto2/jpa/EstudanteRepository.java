package com.akiranim.Projeto2.jpa;

import com.akiranim.Projeto2.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {
}
