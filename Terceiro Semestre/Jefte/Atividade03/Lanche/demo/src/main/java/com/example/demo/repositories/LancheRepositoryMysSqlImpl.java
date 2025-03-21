package com.example.demo.repositories;

import com.example.demo.entities.Lanche;
import com.example.demo.interfaces.LancheRepository;

import java.util.List;

public class LancheRepositoryMysSqlImpl implements LancheRepository {

    @Override
    public Lanche buscarPorCodigo(int lanche_id) {
        return null;
    }

    @Override
    public List<Lanche> buscar() {
        return List.of();
    }

    @Override
    public void adicionar(Lanche lanche) {

    }

    @Override
    public void remover(int lanche_id) {

    }

    @Override
    public void atualizar(int lanche_id, Lanche lanche) {

    }

    @Override
    public boolean vazio() {
        return false;
    }
}
