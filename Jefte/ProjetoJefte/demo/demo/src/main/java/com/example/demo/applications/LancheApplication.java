package com.example.demo.applications;

import com.example.demo.entities.Lanche;
import com.example.demo.respositories.LancheRepository;
import com.example.demo.services.LancheService;

public class LancheApplication {
    private LancheService lancheService;
    private LancheRepository lancheRepository;

    public LancheApplication(LancheService lancheService, LancheRepository lancheRepository){
        this.lancheService = lancheService;
        this.lancheRepository = lancheRepository;
    }

    public void cadastrar(Lanche lanche){
        this.lancheRepository.adicionar(lanche);
        this.lancheService.save(lanche);
    }

}
