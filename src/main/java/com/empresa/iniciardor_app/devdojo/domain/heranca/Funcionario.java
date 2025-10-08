package com.empresa.iniciardor_app.devdojo.domain.heranca;

import lombok.Getter;
import lombok.Setter;

public class Funcionario extends Pessoa {

    @Getter
    @Setter
    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }
}
