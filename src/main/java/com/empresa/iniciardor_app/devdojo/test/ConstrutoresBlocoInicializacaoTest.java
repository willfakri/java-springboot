package com.empresa.iniciardor_app.devdojo.test;

import com.empresa.iniciardor_app.devdojo.domain.Anime;

import java.util.Arrays;

public class ConstrutoresBlocoInicializacaoTest {
    public static void main(String[] args) {
        var anime = new Anime("Avatar");
        //anime.setNome("Avatar");
        System.out.println(anime.getNome());
        System.out.println(anime.getClassificacaoIdade());
    }
}
