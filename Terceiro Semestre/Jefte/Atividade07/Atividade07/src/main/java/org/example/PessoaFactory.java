package org.example;

public class PessoaFactory {
    private int id = 0;

    public Pessoa criarPessoa(String nome, int idade) {

        Pessoa pessoa = new Pessoa(id, nome, idade);
        id++;
        return pessoa;
    }
}
