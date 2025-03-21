package com.example.demo.controllers;

import com.example.demo.entities.Lanche;

import com.example.demo.facade.LancheFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/")
@RestController
public class LancheController {
    private final LancheFacade lancheFacade;
    String destino = "src\\main\\java\\com\\example\\demo\\Imagens";

    @Autowired
    public LancheController(LancheFacade lancheFacade) {
        this.lancheFacade = lancheFacade;
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
    @PutMapping("/{codigo}")
    public void atualizar(@PathVariable int codigo, @RequestBody Lanche lanche){
        lancheFacade.atualizar(codigo, lanche, destino);
    }
    @DeleteMapping("/{codigo}")
    public void deletar(@PathVariable int codigo, @RequestBody Lanche lanche){
        lancheFacade.remover(codigo, lanche, destino);
    }
    @GetMapping("/comprar/{codigo}/{quantidade}")
    public double comprar(@PathVariable int codigo, @PathVariable int quantidade){
        return lancheFacade.calcularLanche(lancheFacade.buscarPorCodigo(codigo), quantidade);
    }
}
