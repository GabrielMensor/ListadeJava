package com.example.exercicio03_lista007.models;

import java.time.LocalDateTime;
import java.util.UUID;

public class Tweet {
    private UUID tweetId;
    private String mensagem;
    private boolean editado;
    private LocalDateTime dataCriacao;

    public Tweet(String mensagem) {
        this.tweetId = UUID.randomUUID();
        this.mensagem = mensagem;
        this.editado = false;
        this.dataCriacao = LocalDateTime.now();
    }

    public UUID getTweetId() {
        return tweetId;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        this.editado = true;
    }

    public boolean isEditado() {
        return editado;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
