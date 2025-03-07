package com.gilDaEsfiha.lanches.models.facade;



import com.gilDaEsfiha.lanches.models.controller.LancheApplication;
import com.gilDaEsfiha.lanches.models.domain.Lanche;

import java.util.List;

public class LancheFacade {
    private LancheApplication lancheApplication;

    public LancheFacade(LancheApplication lancheApplication) {
        this.lancheApplication = lancheApplication;
    }

    public void cadastrar(Lanche lanche, String destino) {
        this.lancheApplication.cadastrar(lanche, destino);
    }

    public List<Lanche> buscar() {
        return this.lancheApplication.buscar();
    }

    public Lanche buscarPorCodigo(int codigo) {
        return this.lancheApplication.buscarPorCodigo(codigo);
    }

    public double calcularLanche(Lanche lanche, int quantidade) {
        return this.lancheApplication.calcularLanche(lanche, quantidade);
    }

    public void remover(int codigo, Lanche lanche, String destino) {
        lancheApplication.remover(codigo, lanche, destino);
    }
    public void atualizar(int codigo, Lanche lanche, String destino) {
        lancheApplication.atualizar(codigo, lanche, destino);

    }
}