package com.akiranim.Projeto2.entities;

import jakarta.persistence.*;
import lombok.*;

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

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "detalhe_professor_id_fk", referencedColumnName = "id")
    private DetalheProfessor detalheProfessor;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "professor",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Curso> cursos = new ArrayList<>();


}
