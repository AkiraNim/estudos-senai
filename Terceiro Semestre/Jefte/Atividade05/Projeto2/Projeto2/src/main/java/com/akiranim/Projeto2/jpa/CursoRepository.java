package com.akiranim.Projeto2.jpa;

import com.akiranim.Projeto2.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository  extends JpaRepository<Curso, Integer> {
}
