package com.empresa.iniciardor_app.devdojo.domain.associacao;

import lombok.Getter;
import lombok.Setter;

public class Seminario {

    @Getter
    @Setter
    private Aluno[] alunos;

    @Getter
    @Setter
    private Professor professor;

    @Getter
    @Setter
    private Local local;
}
