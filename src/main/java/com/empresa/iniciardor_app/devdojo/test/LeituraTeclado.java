package com.empresa.iniciardor_app.devdojo.test;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Olá " + nome + "!");
        System.out.println("Você tem " + idade + " anos.");
    }
}
