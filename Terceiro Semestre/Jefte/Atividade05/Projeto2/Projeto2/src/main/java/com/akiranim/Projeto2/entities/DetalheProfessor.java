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
@Table(name = "detalhe_professor")
public class DetalheProfessor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "hobby")
    private String hobby;

    @Column(name = "linkedin")
    private String linkedin;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "professor_fk", referencedColumnName = "id")
    private Professor professor;
}
