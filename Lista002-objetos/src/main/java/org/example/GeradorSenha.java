package org.example;

import java.util.Random;

public class GeradorSenha {
    private String caracteres;
    private int tamanhoSenha;
    private Random random;

    public GeradorSenha(int tamanhoSenha) {
        this.caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        this.tamanhoSenha = tamanhoSenha;
        this.random = new Random();
    }

    public String gerarSenha() {
        StringBuilder senha = new StringBuilder();
        for (int i = 0; i < tamanhoSenha; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }
        return senha.toString();
    }
}
