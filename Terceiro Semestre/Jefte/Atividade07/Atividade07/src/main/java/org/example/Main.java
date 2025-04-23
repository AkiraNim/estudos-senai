package org.example;

public class Main {
    public static void main(String[] args) {
        PessoaFactory pessoaFactory = new PessoaFactory();


        Pessoa pessoa = pessoaFactory.criarPessoa("João", 30);
        Pessoa pessoa2 = pessoaFactory.criarPessoa("Maria", 25);
        Pessoa pessoa3 = pessoaFactory.criarPessoa("José", 40);

        System.out.println("Pessoa "+ pessoa.getId()+ ": " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());
        System.out.println("Pessoa "+ pessoa2.getId()+ ": " + pessoa2.getNome() + ", Idade: " + pessoa2.getIdade());
        System.out.println("Pessoa "+ pessoa3.getId()+ ": " + pessoa3.getNome() + ", Idade: " + pessoa3.getIdade());
    }
}