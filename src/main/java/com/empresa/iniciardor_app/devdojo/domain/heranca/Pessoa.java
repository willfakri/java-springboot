package com.empresa.iniciardor_app.devdojo.domain.heranca;

public class Pessoa {
    protected String nome;
    protected String cpf;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
