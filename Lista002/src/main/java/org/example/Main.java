package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercicio02();
    }

    static void exercicio01() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int tamanhoSenha = 8;
        Random random = new Random();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanhoSenha; i++) {
            int index = random.nextInt(caracteres.length());
            senha.append(caracteres.charAt(index));
        }

        System.out.println("Senha gerada: " + senha.toString());
    }

    static void exercicio02() {
        String[] nomes = { "William", "Felipe", "Maradona", "Pedro", "Renato" };
        String[] sobrenomes = { "Gaúcho", "Mineiro", "Geromel", "Paulista", "Silva", "Júnior" };
        String[] clubes = { "Criciúma", "Fortaleza", "Vasco", "ABC", "Paysandu", "Próspera", "Brusque" };
        String[] posicoes = { "goleiro", "zagueiro", "lateral", "meio-campo", "atacante" };

//        Random random = new Random();

        Jogador neymar = new Jogador(
                "Neymar",
                "Junior",
                "Santos",
                "Atacantes",
                (short) 33
        );

        Jogador williamBigode = new Jogador(
                "William",
                "Bigode",
                "ABC",
                "Zagueiro",
                (short) 45
        );

//        String nome = nomes[random.nextInt(nomes.length)];
//        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
//        String clube = clubes[random.nextInt(clubes.length)];
//        String posicao = posicoes[random.nextInt(posicoes.length)];
//        short idade = (short) (random.nextInt(18, 65));
//
//        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de " + idade + " anos que atua como " + posicao + ". Atualmente defende o " + clube + ".");

        williamBigode.exibeJogador();
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

        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = random.nextInt(100) + 1; // nível entre 1 e 100

            System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
        }

        scanner.close();
    }
}
