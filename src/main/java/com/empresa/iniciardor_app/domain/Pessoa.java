package com.empresa.iniciardor_app.domain;

public class Pessoa {
    @lombok.Getter
    @lombok.Setter
    private String nome;

    private int idade;
    private char genero;

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public char getGenero(){
        return this.genero;
    }

    public void setGenero(char genero){
        this.genero = genero;
    }
}
