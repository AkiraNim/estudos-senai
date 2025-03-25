package com.akiranim.Projeto2.entities;

import jakarta.persistence.*;

@Entity
public class CursoEstudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "curso_fk", referencedColumnName = "id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "estudante_fk", referencedColumnName = "id")
    private Estudante estudante;
}
