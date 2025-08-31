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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        if (this.vida <= 0) {
            System.out.println(this.nome + " já derrotado");
            return;
        }

        this.vida -= dano;
        if (this.vida <= 0) {
            System.out.println(this.nome +" já derrotado");
        }
    }

    public void atacar(Personagem alvo) {
        if (this.vida <= 0) {
            //System.out.println(alvo.getNome() + " não pode atacar, pois foi derrotado");
        }

        if(alvo.vida <= 0) {
            //System.out.println("Ataque falhou!" + alvo.nome + " derrotado");
            return;
        }

        //System.out.println(this.nome + " ataca " + alvo.nome + " causando " + ataque + " de dano");
        alvo.receberDano(this.ataque);
    }

}
