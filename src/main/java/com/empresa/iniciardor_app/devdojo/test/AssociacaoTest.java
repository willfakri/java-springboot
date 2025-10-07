package com.empresa.iniciardor_app.devdojo.test;

import com.empresa.iniciardor_app.devdojo.domain.associacao.Aluno;
import com.empresa.iniciardor_app.devdojo.domain.associacao.Local;
import com.empresa.iniciardor_app.devdojo.domain.associacao.Professor;
import com.empresa.iniciardor_app.devdojo.domain.associacao.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Local local = new Local();
        Seminario seminario1 = new Seminario();
        Seminario seminario2 = new Seminario();

        local.setSeminario(seminario1);
        aluno.setSeminario(seminario1);
        professor.setSeminarios(new Seminario[]{seminario1, seminario2});

        seminario1.setAlunos(new Aluno[]{ aluno});
        seminario1.setProfessor(professor);
        seminario1.setLocal(local);

        seminario2.setProfessor(professor);
        seminario2.setLocal(local);

//        var jogador1 = new Jogador("Pelé");
//        var jogador2 = new Jogador("Ronaldinho");
//        var jogador3 = new Jogador("Messi");
//        Jogador[] jogadores = {jogador1, jogador2, jogador3};
//        for(Jogador jogador: jogadores) {
//            System.out.println(jogador.getNome());
//        }
    }
}
