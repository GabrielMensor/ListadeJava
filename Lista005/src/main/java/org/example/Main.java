package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercicio01();
    }

    static void exercicio01() {
        Personagem herobrine = new Personagem("Herobrine", 150, 30);
        Personagem shadow = new Personagem("Shadow", 70, 7);
        Personagem eggman = new Personagem("Herobrine", 170, 15);
        Personagem enderDragon = new Personagem("Ender Dragon", 200, 30);

        Personagem jogador = new Personagem("Steve", 100, 20);

        Personagem [] inimigos = {
                herobrine,
                shadow,
                eggman,
                enderDragon
        };

        Random random = new Random();

    }
}