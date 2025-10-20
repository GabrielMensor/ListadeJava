package com.example.exercicio02_lista007.models;

import java.util.UUID;

public class Livro {
    private UUID id;
    private  String titulo;
    private String autor;

    public Livro(String tituli, String autor) {
        this.id = UUID.randomUUID();
        this.titulo = titulo;
        this.autor = autor;
    }

    public UUID getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
