package org.example;

public class Jogador {
    String nome;
    String sobrenome;
    String clube;
    String posicao;
    Short idade;

    Jogador(String nome, String sobrenome, String clube, String posicao, Short idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.clube = clube;
        this.posicao = posicao;
        this.idade = idade;
    }

    void exibeJogador() {
        System.out.println(
                nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao
                        + ". Atualmente defende o " + clube + "."
        );
    }
}
