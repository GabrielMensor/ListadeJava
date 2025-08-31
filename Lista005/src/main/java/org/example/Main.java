package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercicio01();
    }

    static void exercicio01() {
        Personagem herobrine = new Personagem("Herobrine", 140, 20);
        Personagem eggman = new Personagem("Eggman", 70, 7);
        Personagem enderDragon = new Personagem("Ender Dragon", 100, 20);

        Personagem jogador = new Personagem("Steve", 200, 40);

        Personagem [] inimigos = {
                herobrine,
                eggman,
                enderDragon
        };

        Random random = new Random();

        while (jogador.getVida() > 0) {
            boolean todosDerrotados = true;
            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    todosDerrotados = false;
                    break;
                }
            }
            if (todosDerrotados) {
                break;
            }

            Personagem alvo;
            do {
                alvo = inimigos[random.nextInt(inimigos.length)];
            } while (alvo.getVida() == 0);

            jogador.atacar(alvo);

            for (Personagem inimigo : inimigos) {
                if (inimigo.getVida() > 0) {
                    inimigo.atacar(jogador);
                    if (jogador.getVida() == 0) {
                        break;
                    }
                }
            }

            if (jogador.getVida() == 0) {
                System.out.println(jogador.getNome() + " foi derrotado");
            } else {
                for (Personagem inimigo : inimigos) {
                    if (inimigo.getVida() == 0) {
                        System.out.println(inimigo.getNome() + " foi derrotado");
                    }
                }
            }
        }
    }
}