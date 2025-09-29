package com.example.exercicio04_lista006;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    private final PlaylistService playlistService;

    public PlaylistController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping
    public int criarPlaylist(@RequestBody Playlist playlist) {
        return playlistService.criarPlaylist(playlist.getNome());
    }

    @PostMapping("/{id}/musicas")
    public String adicionarMusica(
            @PathVariable int id,
            @RequestBody Musica musica) {
        try {
            playlistService.adicionarMusica(id, musica);
            return "Música adicionada com sucesso!";
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping
    public List<Playlist> listarPlaylists() {
        return playlistService.listarPlaylists();
    }

    @GetMapping("/{id}/musicas")
    public Object listarMusicas(@PathVariable int id) {
        try {
            return playlistService.listarMusicas(id);
        } catch (Exception e) {
            return "Erro: " + e.getMessage();
        }
    }
}
