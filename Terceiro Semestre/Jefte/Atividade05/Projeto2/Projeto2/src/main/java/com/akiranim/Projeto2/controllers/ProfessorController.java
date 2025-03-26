package com.akiranim.Projeto2.controllers;

import com.akiranim.Projeto2.entities.DetalheProfessor;
import com.akiranim.Projeto2.entities.Professor;
import com.akiranim.Projeto2.jpa.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professor/")
public class ProfessorController {
    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorController(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    @GetMapping("")
    public List<Professor> getAll() {
        return this.professorRepository.findAll();
    }

    @GetMapping("{id}")
    public Professor getById(@PathVariable int id) {
        return this.professorRepository.findById(id).get();
    }

    @PostMapping("")
    public Professor save(@RequestBody Professor professor) {
        return this.professorRepository.save(professor);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        this.professorRepository.deleteById(id);
    }

    @PutMapping("{id}")
    public Professor getById(@PathVariable int id, @RequestBody Professor professor) {
        return this.professorRepository.save(professor);
    }
}
