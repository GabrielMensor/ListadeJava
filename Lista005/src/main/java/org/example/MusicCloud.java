package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicCloud {
    private List<Musica> musicasDisponiveis = new ArrayList<>();

    public MusicCloud() {
        musicasDisponiveis.add(new Musica("Macarena", "Los Del Rio"));
        musicasDisponiveis.add(new Musica("Evidências", "Chitãozinho e Xororó"));
        musicasDisponiveis.add(new Musica("Thriller", "Michael Jackson"));
    }

    public Musica buscarMusica(String titulo) throws Exception {
        for(Musica m : musicasDisponiveis) {
            if(m.getTitulo().equalsIgnoreCase(titulo)) {
                return m;
            }
        }
        throw new Exception("A música " + titulo + " não foi encontrada no sistema.");
    }
}
