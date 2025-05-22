package com.example.demo.repositories;

import com.example.demo.entities.Papel;
import com.example.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PapelRepository extends JpaRepository<Papel, Integer> {
}
