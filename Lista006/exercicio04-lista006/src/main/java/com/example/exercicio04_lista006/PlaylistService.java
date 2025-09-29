package com.example.exercicio04_lista006;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;  // container que pode ou não conter um valor sem usar null

@Service
public class PlaylistService {

    private final List<Playlist> playlists = new ArrayList<>();
    private int proxId = 1;

    public int criarPlaylist(String nome) {
        Playlist playlist = new Playlist(proxId, nome);
        playlists.add(playlist);
        proxId++;
        return playlist.getId();
    }

    public void adicionarMusica(int playlistId, Musica musica) throws Exception {
        Playlist playlist = encontrarPlaylistPorId(playlistId);
        playlist.adicionarMusica(musica);
    }

    public List<Playlist> listarPlaylists() {
        return playlists;
    }

    public List<Musica> listarMusicas(int playlistId) throws Exception {
        Playlist playlist = encontrarPlaylistPorId(playlistId);
        return playlist.getMusicas();
    }

    private Playlist encontrarPlaylistPorId(int id) throws Exception {
        Optional<Playlist> playlistOpt = playlists.stream()
                .filter(p ->  p.getId() == id)
                .findFirst();
        if (playlistOpt.isEmpty()) {
            throw new Exception("Playlist não encontrada");
        }
        return playlistOpt.get();
    }
}
