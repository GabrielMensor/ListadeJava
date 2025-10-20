package com.example.exercicio03_lista007.services;

import com.example.exercicio03_lista007.models.Tweet;
import com.example.exercicio03_lista007.models.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RedeSocialService {
    private final List<Usuario> usuarios = new ArrayList<>();

    public RedeSocialService() {
        usuarios.add(new Usuario("Renato", "renato@email.com"));
        usuarios.add(new Usuario("Maria", "maria@email.com"));
        usuarios.add(new Usuario("Pedro", "pedro@email.com"));
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Optional<Usuario> buscarUsuario(UUID id) {
        return usuarios.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    public Optional<Tweet> criarTweet(UUID usuarioId, String mensagem) {
        Optional<Usuario> usuarioOpt = buscarUsuario(usuarioId);
        if(usuarioOpt.isEmpty()) return Optional.empty();

        Tweet tweet = new Tweet(mensagem);
        usuarioOpt.get().getTweets().add(tweet);
        return Optional.of(tweet);
    }

    public Optional<Tweet> atualizarTweet(UUID usuarioId, UUID tweetId, String novaMensagem) {
        Optional<Usuario> usuarioOpt = buscarUsuario(usuarioId);
        if(usuarioOpt.isEmpty()) return Optional.empty();

        return usuarioOpt.get().getTweets().stream()
                .filter(t -> t.getTweetId().equals(tweetId))
                .findFirst()
                .map(tweet -> {
                    tweet.setMensagem(novaMensagem);
                    return tweet;
                });
    }

    public boolean removerTweet(UUID usuarioId, UUID tweetId) {
        Optional<Usuario> usuarioOpt = buscarUsuario(usuarioId);
        if (usuarioOpt.isEmpty()) return false;

        return usuarioOpt.get().getTweets().removeIf(t -> t.getTweetId().equals(tweetId));
    }
}
