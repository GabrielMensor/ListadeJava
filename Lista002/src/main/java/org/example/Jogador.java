package org.example;

public class Jogador {
    // Atributos
    String nome = "Neymar";
    String sobrenome = "Júnior";
    String clube = "Santos";
    String posicao = "atacante";
    Short idade = 33;

    // Construtor
    Jogador(String nome, String sobrenome, String clube, String posicao, Short idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.clube = clube;
        this.posicao = posicao;
        this.idade = idade;
    }
}
