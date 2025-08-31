package org.example;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nome;
    private List<Musica> musicas = new ArrayList<>();

    public Playlist(String nome) {
        this.nome = nome;
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
        System.out.println("Você adicionou a música " + musica.getTitulo() + " na playlist.");
    }

    public void imprimirPlaylist() {
        System.out.println("\nPlaylist: " + nome);
        for (Musica m : musicas) {
            System.out.println("- " + m.getTitulo());
        }
    }
}
