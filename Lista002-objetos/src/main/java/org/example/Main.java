package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio02();
    }

    static void exercicio01() {
        GeradorSenha gerador = new GeradorSenha(8);
        String senha = gerador.gerarSenha();
        System.out.println("Senha gerada: " + senha);
    }

    static void exercicio02() {
        String[] nomes = { "William", "Felipe", "Maradona", "Pedro", "Renato", "Lucas", "Carlos", "João", "Paulo", "Rafael", "André", "Bruno", "Gustavo", "Diego" };
        String[] sobrenomes = { "Gaúcho", "Mineiro", "Geromel", "Paulista", "Silva", "Júnior", "Costa", "Alves", "Pereira", "Souza", "Fernandes" };
        String[] clubes = { "Criciúma", "Fortaleza", "Vasco", "ABC", "Paysandu", "Próspera", "Brusque", "Flamengo", "Palmeiras", "Grêmio", "Corinthians" };

        Random random = new Random();

        // Posições conforme 4-4-2
        String[] posicoes = {
                "goleiro",
                "lateral",
                "zagueiro",
                "zagueiro",
                "lateral",
                "meio-campo",
                "meio-campo",
                "meio-campo",
                "meio-campo",
                "atacante",
                "atacante"
        };

        Jogador[] jogadores = new Jogador[11];

        for (int i = 0; i < 11; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
            String clube = clubes[random.nextInt(clubes.length)];
            String posicao = posicoes[i];
            short idade = (short) (random.nextInt(18, 55));

            jogadores[i] = new Jogador(nome, sobrenome, clube, posicao, idade);
        }

        for (Jogador jogador : jogadores) {
            jogador.exibeJogador();
        }
    }

    static void exercicio03() {
        String[] nomes = {
                "Pikachu", "Charmander", "Bulbasaur", "Squirtle", "Eevee",
                "Jigglypuff", "Meowth", "Psyduck", "Snorlax", "Gengar"
        };

        String[] tipos = {
                "Elétrico", "Fogo", "Planta", "Água", "Normal",
                "Fantasma", "Voador", "Lutador", "Pedra", "Psíquico"
        };

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos Pokémon você deseja gerar? ");
        int quantidade = scanner.nextInt();
        System.out.println();

        for(int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = random.nextInt(1, 100);

            Pokemon p = new Pokemon(nome, tipo, nivel);
            p.mostrarInfo();
        }

        scanner.close();
    }
}
