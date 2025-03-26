package com.akiranim.Projeto2.jpa;

import com.akiranim.Projeto2.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
}
