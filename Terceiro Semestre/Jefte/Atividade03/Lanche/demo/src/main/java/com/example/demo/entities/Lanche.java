package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lanches")
public class Lanche {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lanche_id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private double preco;

    @Column(name = "imagem")
    private String imagem;

    public Lanche(int lanche_id, String nome, double preco, String imagem) {
        this.lanche_id = lanche_id;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return lanche_id;
    }

    public void setCodigo(int lanche_id) {
        this.lanche_id = lanche_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Lanche{" +
                "id=" + lanche_id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
