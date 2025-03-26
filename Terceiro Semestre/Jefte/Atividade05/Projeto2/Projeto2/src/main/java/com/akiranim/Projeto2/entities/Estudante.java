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
@Table(name = "estudante")
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobreNome")
    private String sobreNome;

    @Column(name = "email")
    private String email;

    @Column(name = "idade")
    private int idade;

    @OneToMany(mappedBy = "estudante", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<CursoEstudante> cursoEstudantes;

}
