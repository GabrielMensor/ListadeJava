package com.example.exercicio03_lista007.models;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private UUID id;
    private String nome;
    private String email;
    private List<Tweet> tweets = new ArrayList<>();

    public Usuario(String nome, String email) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
