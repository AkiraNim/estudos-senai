package com.example.demo.repositories;

import com.example.demo.entities.Lanche;
import com.example.demo.interfaces.LancheRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LancheRepositoryImpl implements LancheRepository {
    private List<Lanche> lanches = new ArrayList<>();

    public Lanche buscarPorCodigo(int lanche_id) {
        return lanches.stream()
                .filter(p -> p.getCodigo() == lanche_id)
                .findFirst()
                .orElse(null);
    }
    public List<Lanche> buscar(){
        return lanches;
    }
    public void adicionar(Lanche lanche){
        lanches.add(lanche);
    }
    public void remover(int lanche_id){
        lanches.removeIf(p -> p.getCodigo() == lanche_id);
    }
    public void atualizar(int lanche_id, Lanche lanche){
        Lanche lancheInMemory = this.buscarPorCodigo(lanche_id);
        lancheInMemory.setNome(lanche.getNome());
        lancheInMemory.setPreco(lanche.getPreco());
        lancheInMemory.setImagem(lanche.getImagem());
    }
    public boolean vazio(){
        return lanches.isEmpty();
    }
}
