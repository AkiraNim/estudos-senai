package com.example.demo.repositories;

import com.example.demo.entities.Lanche;
import com.example.demo.interfaces.LancheRepository;
import com.example.demo.repositories.jpa.LancheJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LancheRepositoryMysSqlImpl implements LancheRepository {
    private final LancheJpa lancheJpa;

    @Autowired
    public LancheRepositoryMysSqlImpl(LancheJpa lancheJpa) {
        this.lancheJpa = lancheJpa;
    }

    @Override
    public Lanche buscarPorCodigo(int lancheId) {
        return this.lancheJpa.findById(lancheId).get();
    }

    @Override
    public List<Lanche> buscar() {
        return this.lancheJpa.findAll();
    }

    @Override
    public void adicionar(Lanche lanche) {
        this.lancheJpa.save(lanche);
    }

    @Override
    public void remover(int lancheId) {
        this.lancheJpa.deleteById(lancheId);
    }

    @Override
    public void atualizar(int lancheId, Lanche lanche) {
        Lanche lancheDb = this.lancheJpa.findById(lancheId).get();

        lancheDb.setNome(lanche.getNome());
        lancheDb.setPreco(lanche.getPreco());
        lancheDb.setImagem(lanche.getImagem());

        this.lancheJpa.save(lancheDb);
    }

    @Override
    public boolean vazio() {
        return false;
    }
}
