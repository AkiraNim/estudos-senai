package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "papel")
public class Papel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String papel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Usuario usuario;

    @Column(name = "usuario_id")
    private int usuarioId;

    public Papel() {
    }

    public Papel(String papel) {
        this.papel = papel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    @Override
    public String toString() {
        return "Papel{" +
                "id=" + id +
                ", papel='" + papel + '\'' +
                '}';
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
}
