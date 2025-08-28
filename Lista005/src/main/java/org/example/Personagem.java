package org.example;

import java.util.Scanner;

public class Personagem {
    private String nome;
    private int vida;
    private int ataque;

    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        if (this.vida <= 0) {
            System.out.println("Personagem já derrotado");
            return;
        }

        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println("Personagem já derrotado");
        }
    }

    public void atacar(Personagem alvo) {
        if (this.vida <= 0) {
            System.out.println("Personagem não pode atacar, pois foi derrotado");
        }

        if(alvo.vida <= 0) {
            System.out.println("Ataque falhou!");
            return;
        }

        System.out.println(this.nome + " ataca " + alvo.nome + " causando " + ataque + " de dano");
        alvo.receberDano(this.ataque);
    }

}
