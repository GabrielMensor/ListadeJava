package com.example.exercicio02_lista006;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Exercicio02Lista006Controller {
    private final JogadorService jogadorService;

    public Exercicio02Lista006Controller(JogadorService jogadorService) {
        this.jogadorService = jogadorService;
    }

    @GetMapping("/jogador/{time}/{posicao}")
    public Jogador gerarJogador(@PathVariable String time, @PathVariable String posicao) {
        return jogadorService.gerarJogador(time, posicao);
    }
}
