package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "lanches")
public class Lanche {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int lancheId;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private double preco;

    @Column(name = "imagem")
    private String imagem;

    public Lanche() {

    }

    public Lanche(String nome, double preco, String imagem) {
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public Lanche(int lancheId, String nome, double preco, String imagem) {
        this.lancheId = lancheId;
        this.nome = nome;
        this.preco = preco;
        this.imagem = imagem;
    }

    public int getCodigo() {
        return lancheId;
    }

    public void setCodigo(int lanche_id) {
        this.lancheId = lanche_id;
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
                "id=" + lancheId +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", imagem='" + imagem + '\'' +
                '}';
    }
}
