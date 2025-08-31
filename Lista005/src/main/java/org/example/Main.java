package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio03();
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

    static void exercicio02() {
        Barco netuno = new Barco("Netuno", 20);
        Barco rincao = new Barco("Rincão", 7);
        Barco atlantico = new Barco("Atlântico", 50);
        Barco juncos = new Barco("Juncos", 9);
        Barco poseidon = new Barco("Poseidon", 12);

        Barco [] barcos = {
                netuno,
                rincao,
                atlantico,
                juncos,
                poseidon
        };

        PortoPequeno PortoDeItapoa = new PortoPequeno("Porto de Itapoá");
        PortoGrande PortoDeSantos = new PortoGrande("Porto de Santos");

        for (Barco barco : barcos) {
            PortoDeItapoa.atracarBarco(barco);
            PortoDeSantos.atracarBarco(barco);
        }

    }

    static void exercicio03() {
        Scanner scanner = new Scanner(System.in);
        MusicCloud cloud = new MusicCloud();

        System.out.println("Digite o nome da playlist: ");
        String nomePlaylist = scanner.nextLine();
        Playlist playlist = new Playlist(nomePlaylist);

        while (true) {
            System.out.println("Digite o nome da música (ou 'sair' para finalizar): ");
            String tituloMusica = scanner.nextLine();

            if(tituloMusica.equalsIgnoreCase("sair")) break;

            try {
                Musica musica = cloud.buscarMusica(tituloMusica);
                playlist.adicionarMusica(musica);
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }

        playlist.imprimirPlaylist();
        scanner.close();
    }
}