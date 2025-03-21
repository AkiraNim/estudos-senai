package com.example.demo.applications;

import com.example.demo.entities.Lanche;
import com.example.demo.repositories.LancheRepositoryImpl;
import com.example.demo.services.LancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.List;

@Component
public class LancheApplication {
    private LancheService lancheService;
    private LancheRepositoryImpl lancheRepositoryImpl;

    @Autowired
    public LancheApplication(LancheService lancheService, LancheRepositoryImpl lancheRepositoryImpl) {
        this.lancheService = lancheService;
        this.lancheRepositoryImpl = lancheRepositoryImpl;
    }

    public void cadastrar(Lanche lanche, String destino) {
        this.lancheRepositoryImpl.adicionar(lanche);
        this.lancheService.salvar( lanche, Paths.get(lanche.getImagem()), Paths.get(destino));

    }

    public List<Lanche> buscar() {
        return this.lancheRepositoryImpl.buscar();
    }

    public Lanche buscarPorCodigo(int lanche_id) {
        return this.lancheRepositoryImpl.buscarPorCodigo(lanche_id);
    }

    public double calcularLanche(Lanche lanche, int quantidade) {
        return lanche.getPreco() * quantidade;
    }

    public void remover(int codigo, Lanche lanche, String destino) {
        lancheRepositoryImpl.remover(codigo);
        lancheService.excluirArquivo(destino, String.valueOf(lanche.getCodigo()));

    }

    public void atualizar(int lanche_id, Lanche lanche, String destino) {
        lancheRepositoryImpl.atualizar(lanche_id, lanche);
        lancheService.atualizar(lanche_id, lanche, destino);
    }

}