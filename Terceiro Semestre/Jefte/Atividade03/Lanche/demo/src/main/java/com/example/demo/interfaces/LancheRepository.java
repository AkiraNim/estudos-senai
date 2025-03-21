package com.example.demo.interfaces;

import com.example.demo.entities.Lanche;

import java.util.List;

public interface LancheRepository {
    public Lanche buscarPorCodigo(int lancheId);
    public List<Lanche> buscar();
    public void adicionar(Lanche lanche);
    public void remover(int lancheId);
    public void atualizar(int lancheId, Lanche lanche);
    public boolean vazio();
}
