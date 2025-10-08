package com.empresa.iniciardor_app.devdojo.test;

import com.empresa.iniciardor_app.devdojo.domain.heranca.Funcionario;

public class HerancaTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Peteco", "123456789", 1234.56);
        funcionario.imprime();
    }
}
