package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio05();
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

    static void exercicio04() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o título da postagem:");
            String titulo = scanner.nextLine();

            System.out.println("Digite a descrição da postagem:");
            String descricao = scanner.nextLine();

            System.out.println("Digite o tipo da postagem (TEXTO, IMAGEM, VIDEO):");
            String tipoInput = scanner.nextLine().toUpperCase();

            TipoPostagem tipo = TipoPostagem.valueOf(tipoInput);

            Postagem postagem = new Postagem(titulo, descricao, tipo);

            MyBook myBook = new MyBook();
            Fotogram fotogram = new Fotogram();
            AnyTube anyTube = new AnyTube();

            // MyBook
            try {
                if (postagem.getTipo() == TipoPostagem.TEXTO) {
                    myBook.compartilharPostagem(postagem);
                } else if (postagem.getTipo() == TipoPostagem.IMAGEM) {
                    myBook.compartilharImagem(postagem);
                } else {
                    myBook.compartilharVideo(postagem);
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao compartilhar no MyBook: " + e.getMessage());
            }

            // Fotogram
            try {
                if (postagem.getTipo() == TipoPostagem.TEXTO) {
                    fotogram.compartilharPostagem(postagem);
                } else if (postagem.getTipo() == TipoPostagem.IMAGEM) {
                    fotogram.compartilharImagem(postagem);
                } else {
                    fotogram.compartilharVideo(postagem);
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao compartilhar no Fotogram: " + e.getMessage());
            }

            // AnyTube
            try {
                if (postagem.getTipo() == TipoPostagem.TEXTO) {
                    anyTube.compartilharPostagem(postagem);
                } else if (postagem.getTipo() == TipoPostagem.IMAGEM) {
                    anyTube.compartilharImagem(postagem);
                } else {
                    anyTube.compartilharVideo(postagem);
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro ao compartilhar no AnyTube: " + e.getMessage());
            }

            scanner.close();
        }

        static void exercicio05() {
            Scanner sc = new Scanner(System.in);
            Cinema cinema = new Cinema();

            // Adiciona filmes
            cinema.adicionarFilme(new Filme("Homem Aranha", 20.0, 16));
            cinema.adicionarFilme(new Filme("Vingadores", 25.0, 14));
            cinema.adicionarFilme(new Filme("Toy Story", 15.0, 0));
            cinema.adicionarFilme(new Filme("Matrix", 22.0, 18));
            cinema.adicionarFilme(new Filme("Evidências", 18.0, 12));

            boolean continuar = true;

            while (continuar) {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = sc.nextLine();

                Filme filmeEscolhido = cinema.buscarFilme(nomeFilme);
                if (filmeEscolhido == null) {
                    System.out.println("Filme não encontrado!");
                    continue;
                }

                System.out.println("Qual assento você deseja?");
                String assento = sc.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeCliente = sc.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = Integer.parseInt(sc.nextLine());

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                try {
                    cinema.venderIngresso(cliente, filmeEscolhido, assento);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

                System.out.println("Deseja comprar outro ingresso? (s/n)");
                String resp = sc.nextLine();
                if (!resp.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            }

            sc.close();
            System.out.println("\nIngressos vendidos:");
            for (Ingresso i : cinema.getIngressosVendidos()) {
                System.out.println("- " + i);
            }
        }
}