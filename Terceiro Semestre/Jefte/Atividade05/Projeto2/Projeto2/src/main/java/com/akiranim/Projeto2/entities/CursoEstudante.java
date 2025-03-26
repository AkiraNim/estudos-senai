package com.akiranim.Projeto2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CursoEstudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "curso_id_fk", referencedColumnName = "id")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "estudante_id_fk", referencedColumnName = "id")
    private Estudante estudante;
}
