package com.example.exercicio03_lista007.controllers;

import com.example.exercicio03_lista007.models.Usuario;
import com.example.exercicio03_lista007.services.RedeSocialService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/usuarios")
public class RedeSocialController {
    private final RedeSocialService service;

    public RedeSocialController(RedeSocialService service) {
        this.service = service;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return service.listarUsuarios();
    }

    @GetMapping("/{id}^/tweets")
    public ResponseEntity<?> listarTweets(@PathVariable UUID id) {
        return service.buscarUsuario(id)
                .map(u -> ResponseEntity.ok(u.getTweets()))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/{id}/tweets")
    public ResponseEntity<?> criarTweet(@PathVariable UUID id, @RequestBody Map<String, String> body) {
        String mensagem = body.get("mensagem");

        return service.criarTweet(id, mensagem)
                .<ResponseEntity<?>>map(ResponseEntity::ok)
                .orElse(ResponseEntity.badRequest().body("Usuário não encontrado"));
    }

    @DeleteMapping("/{id}/tweets/{tweetId}")
    public ResponseEntity<String> deletarTweet(@PathVariable UUID id, @PathVariable UUID tweetId) {
        boolean removido = service.removerTweet(id, tweetId);

        if(removido) {
            return ResponseEntity.ok("Tweet removido com sucesso");
        } else {
            return ResponseEntity.badRequest().body("Usuário ou tweet não encontrado");
        }
    }
}
