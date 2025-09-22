package com.example.exercicio02_lista006;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class JogadorService {
    private final List<String> nomes = List.of("Ronaldo", "Pelé", "Zico", "Romário", "Neymar", "Kaká");
    private final List<String> sobrenomes = List.of("Fenômeno", "Santos", "Gaúcho", "Souza", "Oliveira", "Júnior");
    private final Random random = new Random();

    public Jogador gerarJogador(String time, String posicao) {
        String nome = nomes.get(random.nextInt(nomes.size()));
        String sobrenome = sobrenomes.get(random.nextInt(sobrenomes.size()));
        int idade = 16 + random.nextInt(23);

        return new Jogador(nome, sobrenome, idade, posicao, capitalizar(time));
    }

    private String capitalizar(String texto) {
        if (texto == null || texto.isEmpty()) return texto;
        return texto.substring(0,1).toUpperCase() + texto.substring(1).toLowerCase();
    }
}
