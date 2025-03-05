package com.gilDaEsfiha.lanches.controller;



import com.gilDaEsfiha.lanches.domain.Lanche;
import com.gilDaEsfiha.lanches.repositories.LancheRepository;
import com.gilDaEsfiha.lanches.service.LancheService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Paths;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class LancheApplication {
    private LancheService lancheService;
    private LancheRepository lancheRepository;

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

    public Lanche buscarPorCodigo(int codigo) {
        return this.lancheRepository.buscarPorCodigo(codigo);
    }

    public double calcularLanche(Lanche lanche, int quantidade) {
        return lanche.getPreco() * quantidade;
    }

    public void remover(int codigo, Lanche lanche, String destino) {
        lancheRepository.remover(codigo);
        lancheService.excluirArquivo(destino, String.valueOf(lanche.getCodigo()));

    }

    public void atualizar(int codigo, Lanche lanche, String destino) {
        lancheRepository.atualizar(codigo, lanche);
        lancheService.atualizar(codigo, lanche, destino);
    }

}