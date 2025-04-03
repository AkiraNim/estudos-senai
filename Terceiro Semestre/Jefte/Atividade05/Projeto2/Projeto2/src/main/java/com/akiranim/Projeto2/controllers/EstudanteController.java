package com.akiranim.Projeto2.controllers;

import com.akiranim.Projeto2.entities.Estudante;
import com.akiranim.Projeto2.jpa.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/estudante/")
public class EstudanteController {
    private final EstudanteRepository estudanteRepository;

    @Autowired
    public EstudanteController(EstudanteRepository estudanteRepository) {
        this.estudanteRepository = estudanteRepository;
    }

    @GetMapping("")
    public List<Estudante> getAll() {
        return this.estudanteRepository.findAll();
    }

    @GetMapping("{id}")
    public Estudante getById(@PathVariable int id) {
        return this.estudanteRepository.findById(id).get();
    }

    @PostMapping("")
    public Estudante save(@RequestBody Estudante estudante) {
        return this.estudanteRepository.save(estudante);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.estudanteRepository.deleteById(id);
    }

    @PutMapping
    public Estudante getById(@RequestBody Estudante estudante) {
        return this.estudanteRepository.save(estudante);
    }
}
