package com.empresa.iniciardor_app.devdojo.domain;

import lombok.Getter;
import lombok.Setter;

public class Jogador {
    @Getter
    @Setter
    private String nome;

    public Jogador(String nome){
        this.nome = nome;
    }
}
