package com.example.demo.controllers;

import com.example.demo.applications.LancheApplication;
import com.example.demo.entities.Lanche;

import com.example.demo.facade.LancheFacade;
import com.example.demo.repositories.LancheRepository;
import com.example.demo.services.LancheService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class LancheController {
    String destino = "src\\main\\java\\com\\example\\demo\\Imagens";

    private static LancheRepository lancheRepository;
    private static LancheService lancheService;
    private static LancheApplication lancheApplication;
    private static LancheFacade lancheFacade;

    private static void injetarDependencias() {
        lancheRepository = new LancheRepository();
        lancheService = new LancheService();
        lancheApplication = new LancheApplication(lancheService, lancheRepository);
        lancheFacade = new LancheFacade(lancheApplication);
    }

    public LancheController() {
        injetarDependencias();

        Lanche lanche1 = new Lanche(1, "jorge", 1.57, "raiz");
        Lanche lanche2 = new Lanche(2, "jilson", 1.77, "raize");
        Lanche lanche3 = new Lanche(3, "marselo", 1.87, "raizes");

        this.lancheFacade.cadastrar(lanche1, destino);
        this.lancheFacade.cadastrar(lanche2, destino);
        this.lancheFacade.cadastrar(lanche3, destino);
    }

    @GetMapping("")
    public List<Lanche> get(){
        return lancheFacade.buscar();
    }

    @GetMapping("/{codigo}")
    public Lanche getLanche(@PathVariable int codigo){
        return lancheFacade.buscarPorCodigo(codigo);
    }
    @PostMapping("")
    public void cadastrar(@RequestBody Lanche lanche){
        lancheFacade.cadastrar(lanche, destino);
    }
}
