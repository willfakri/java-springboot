package com.empresa.iniciardor_app.devdojo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

/**
 * 1 - Alocado espaco em memória pro objeto <br/>
 * 2 - Cada atributo de classe é criado e inicializado com valores default ou o quer for passado <br/>
 * 3 - Bloco de inicialização é executado <br/>
 * 4 - Construtor é executado
 */
public class Anime {
    private String nome;
    static String produtora = "Bandai";

    @Getter
    @Setter
    private int classificacaoIdade = 16;

    private int[] episodios;

    {
        episodios = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(this.getEpisodios()));
    }

    public Anime() {
        System.out.println("Construtor Anime()");
    }

    public Anime(String nome) {
        this.nome = nome;
        System.out.println("Construtor Anime(nome)");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    public static String getProdutora(){
        return Anime.produtora;
    }
}
