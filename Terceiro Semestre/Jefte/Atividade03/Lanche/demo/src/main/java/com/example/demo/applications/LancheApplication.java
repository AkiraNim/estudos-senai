package com.example.demo.applications;

import com.example.demo.entities.Lanche;
import com.example.demo.interfaces.LancheRepository;
import com.example.demo.services.LancheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Paths;
import java.util.List;

@Component
public class LancheApplication {
    private LancheService lancheService;
    private LancheRepository lancheRepository;

    @Autowired
    public LancheApplication(LancheService lancheService, LancheRepository lancheRepository) {
        this.lancheService = lancheService;
        this.lancheRepository = lancheRepository;
    }

    public void cadastrar(Lanche lanche, String destino) {
        this.lancheRepository.adicionar(lanche);
        this.lancheService.salvar( lanche, Paths.get(lanche.getImagem()), Paths.get(destino));

    }

    public List<Lanche> buscar() {
        return this.lancheRepository.buscar();
    }

    public Lanche buscarPorCodigo(int lancheId) {
        return this.lancheRepository.buscarPorCodigo(lancheId);
    }

    public double calcularLanche(Lanche lanche, int quantidade) {
        return lanche.getPreco() * quantidade;
    }

    public void remover(int lancheId, String destino) {
        lancheService.excluirArquivo(destino, String.valueOf(lancheId));
        lancheRepository.remover(lancheId);


    }

    public void atualizar(int lancheId, Lanche lanche, String destino) {
        lancheRepository.atualizar(lancheId, lanche);
        lancheService.atualizar(lanche, destino);
    }

}