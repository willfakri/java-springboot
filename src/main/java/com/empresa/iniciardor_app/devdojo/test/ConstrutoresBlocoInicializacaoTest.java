package com.empresa.iniciardor_app.devdojo.test;

import com.empresa.iniciardor_app.devdojo.domain.Anime;

import java.util.Arrays;

public class ConstrutoresBlocoInicializacaoTest {
    public static void main(String[] args) {
        System.out.println("Exemplo de static, na classe sem precisar da instância do objeto. Produtora:" + Anime.getProdutora());
        var anime = new Anime("Avatar");
        //anime.setNome("Avatar");
        System.out.println(anime.getNome());
        System.out.println(anime.getClassificacaoIdade());

    }
}
