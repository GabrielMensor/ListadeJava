package com.example.exercicio01_lista007;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/principal")
    public List<Jogador> getTitulares() {
        return timeService.getTitulares();
    }

    @GetMapping("/reservas")
    public List<Jogador> getReservas() {
        return timeService.getReservas();
    }


    @PutMapping("/jogador/{posicaoTitular}/{posicaoReserva}")
    public ResponseEntity<String> substituirJogador(
            @PathVariable int posicaoTitular,
            @PathVariable int posicaoReserva
    ) {
        boolean sucesso = timeService.substituirJogador(posicaoTitular, posicaoReserva);

        if (sucesso) {
            return ResponseEntity.ok("Substituição realizada com sucesso!");
        } else {
            return ResponseEntity.badRequest().body("Índice inválido! Verifique titular e reserva.");
        }
    }
}
