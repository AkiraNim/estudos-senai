package com.example.demo.facade;

import com.example.demo.applications.LancheApplication;
import com.example.demo.entities.Lanche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LancheFacade {
    private LancheApplication lancheApplication;

    @Autowired
    public LancheFacade(LancheApplication lancheApplication) {
        this.lancheApplication = lancheApplication;
    }

    public void cadastrar(Lanche lanche, String destino) {
        this.lancheApplication.cadastrar(lanche, destino);
    }

    public List<Lanche> buscar() {
        return this.lancheApplication.buscar();
    }

    public Lanche buscarPorCodigo(int lanche_id) {
        return this.lancheApplication.buscarPorCodigo(lanche_id);
    }

    public double calcularLanche(Lanche lanche, int quantidade) {
        return this.lancheApplication.calcularLanche(lanche, quantidade);
    }

    public void remover(int lanche_id, String destino) {
        lancheApplication.remover(lanche_id, destino);
    }
    public void atualizar(int lanche_id, Lanche lanche, String destino) {
        lancheApplication.atualizar(lanche_id, lanche, destino);

    }
}