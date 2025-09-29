package com.example.exercicio01_lista007;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TimeService {
    private final List<Jogador> titulares = new ArrayList<>();
    private final List<Jogador> reservas = new ArrayList<>();

    public TimeService() {
        // Inicializando 11 titulares
        for (int i = 0; i < 11; i++) {
            titulares.add(new Jogador("Titular " + (i + 1), "Posição " + (i + 1), 20 + i));
        }

        // Inicializando 5 reservas
        for (int i = 0; i < 5; i++) {
            reservas.add(new Jogador("Reserva " + (i + 1), "Posição R" + (i + 1), 18 + i));
        }
    }

    public List<Jogador> getTitulares() {
        return titulares;
    }

    public List<Jogador> getReservas() {
        return reservas;
    }

    public boolean substituirJogador(int posicaoTitular, int posicaoReserva) {
        if (posicaoTitular < 0 || posicaoTitular >= titulares.size()
                || posicaoReserva < 0 || posicaoReserva >= reservas.size()) {
            return false; // índices inválidos
        }

        Jogador titularSai = titulares.get(posicaoTitular);
        Jogador reservaEntra = reservas.get(posicaoReserva);

        // Troca
        titulares.set(posicaoTitular, reservaEntra);
        reservas.set(posicaoReserva, titularSai);

        return true;
    }
}
