package com.empresa.iniciardor_app.devdojo.test;

import com.empresa.iniciardor_app.devdojo.domain.Jogador;

public class AssociacaoTest {
    public static void main(String[] args) {
        var jogador1 = new Jogador("Pelé");
        var jogador2 = new Jogador("Ronaldinho");
        var jogador3 = new Jogador("Messi");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        for(Jogador jogador: jogadores) {
            System.out.println(jogador.getNome());
        }
    }
}
