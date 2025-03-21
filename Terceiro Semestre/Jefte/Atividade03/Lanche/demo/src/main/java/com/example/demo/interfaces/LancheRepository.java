package com.example.demo.interfaces;

import com.example.demo.entities.Lanche;

import java.util.List;

public interface LancheRepository {
    public Lanche buscarPorCodigo(int lanche_id);
    public List<Lanche> buscar();
    public void adicionar(Lanche lanche);
    public void remover(int lanche_id);
    public void atualizar(int lanche_id, Lanche lanche);
    public boolean vazio();
}
