package com.akiranim.Projeto2.controllers;

import com.akiranim.Projeto2.entities.CursoEstudante;
import com.akiranim.Projeto2.jpa.CursoEstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursoEstudante/")
public class CursoEstudanteController {
    private final CursoEstudanteRepository cursoEstudanteRepository;

    @Autowired
    public CursoEstudanteController(CursoEstudanteRepository cursoEstudanteRepository) {
        this.cursoEstudanteRepository = cursoEstudanteRepository;
    }

    @GetMapping("")
    public List<CursoEstudante> getAll() {
        return this.cursoEstudanteRepository.findAll();
    }

    @GetMapping("{id}")
    public CursoEstudante getById(@PathVariable int id) {
        return this.cursoEstudanteRepository.findById(id).get();
    }

    @PostMapping("")
    public CursoEstudante save(@RequestBody CursoEstudante cursoEstudante) {
        return this.cursoEstudanteRepository.save(cursoEstudante);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.cursoEstudanteRepository.deleteById(id);
    }

    @PutMapping
    public CursoEstudante getById(@RequestBody CursoEstudante cursoEstudante) {
        return this.cursoEstudanteRepository.save(cursoEstudante);
    }
}
