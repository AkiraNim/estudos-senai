package com.akiranim.Projeto2.controllers;

import com.akiranim.Projeto2.entities.Curso;
import com.akiranim.Projeto2.entities.Professor;
import com.akiranim.Projeto2.jpa.CursoRepository;
import com.akiranim.Projeto2.jpa.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso/")
public class CursoController {
    private final CursoRepository cursoRepository;
    private final ProfessorRepository professorRepository;

    @Autowired
    public CursoController(CursoRepository cursoRepository, ProfessorRepository professorRepository) {
        this.cursoRepository = cursoRepository;
        this.professorRepository = professorRepository;
    }

    @GetMapping("")
    public List<Curso> getAll() {
        return this.cursoRepository.findAll();
    }

    @GetMapping("{id}")
    public Curso getById(@PathVariable int id) {
        return this.cursoRepository.findById(id).get();
    }

    @PostMapping("")
    public Curso save(@RequestBody Curso curso) {
        return this.cursoRepository.save(curso);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.cursoRepository.deleteById(id);
    }

    @PutMapping
    public Curso getById(@RequestBody Curso curso) {
        return this.cursoRepository.save(curso);
    }
}
