package com.akiranim.Projeto2.entities;

import jakarta.persistence.*;
import lombok.*;

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

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "curso_id_fk", referencedColumnName = "id", insertable = false, updatable = false)
    private Curso curso;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "estudante_id_fk", referencedColumnName = "id", insertable = false, updatable = false)
    private Estudante estudante;

    @Column(name = "estudante_id_fk")
    private int estudanteId;

    @Column(name = "curso_id_fk")
    private int cursoId;
}
