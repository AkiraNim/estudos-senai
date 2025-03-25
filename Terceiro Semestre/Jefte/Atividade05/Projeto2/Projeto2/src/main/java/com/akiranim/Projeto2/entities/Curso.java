package com.akiranim.Projeto2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<CursoEstudante> cursoEstudantes;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_fk", referencedColumnName = "id")
    private Professor professor;

}
