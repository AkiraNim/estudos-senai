package com.example.demo.facade;

import com.example.demo.applications.LancheApplication;
import com.example.demo.entities.Lanche;

public class LancheFacade {
    private LancheApplication lancheApplication;
    public LancheFacade(LancheApplication lancheApplication){
        this.lancheApplication = lancheApplication;
    }
    public void cadastrar(Lanche lanche){
        this.lancheApplication.cadastrar(lanche);
    }
}
