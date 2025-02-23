package com.example.demo.facade;

import com.example.demo.applications.LancheApplication;
import com.example.demo.entities.Lanche;
import com.example.demo.repositories.LancheRepository;
import com.example.demo.services.LancheService;

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

    public void remover(int codigo) {
        lancheApplication.remover(codigo);
    }
    public void atualizar(int codigo, Lanche lanche, String destino) {
        lancheApplication.atualizar(codigo, lanche, destino);

    }
}
