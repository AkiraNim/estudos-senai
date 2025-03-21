package com.example.demo.repositories.jpa;

import com.example.demo.entities.Lanche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancheJpa extends JpaRepository <Lanche, Integer>{

}
