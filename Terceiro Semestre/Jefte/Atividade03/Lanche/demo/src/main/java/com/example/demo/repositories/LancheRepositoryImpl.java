package com.example.demo.repositories;

import com.example.demo.entities.Lanche;
import com.example.demo.interfaces.LancheRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class LancheRepositoryImpl implements LancheRepository {
    private List<Lanche> lanches = new ArrayList<>();

    public Lanche buscarPorCodigo(int lancheId) {
        return lanches.stream()
                .filter(p -> p.getCodigo() == lancheId)
                .findFirst()
                .orElse(null);
    }
    public List<Lanche> buscar(){
        return lanches;
    }
    public void adicionar(Lanche lanche){
        lanches.add(lanche);
    }
    public void remover(int lancheId){
        lanches.removeIf(p -> p.getCodigo() == lancheId);
    }
    public void atualizar(int lancheId, Lanche lanche){
        Lanche lancheInMemory = this.buscarPorCodigo(lancheId);
        lancheInMemory.setNome(lanche.getNome());
        lancheInMemory.setPreco(lanche.getPreco());
        lancheInMemory.setImagem(lanche.getImagem());
    }
    public boolean vazio(){
        return lanches.isEmpty();
    }
}
