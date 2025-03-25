package com.akiranim.Projeto2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "professor")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalhe_professor_fk", referencedColumnName = "id")
    private DetalheProfessor detalheProfessor;

    @OneToMany(mappedBy = "professor",cascade = CascadeType.ALL)
    private List<Curso> cursos = new ArrayList<>();


}
