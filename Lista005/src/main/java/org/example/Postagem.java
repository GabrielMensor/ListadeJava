package org.example;

public class Postagem {
    private String titulo;
    private String descricao;
    private TipoPostagem tipo;

    public Postagem(String titulo, String descricao, TipoPostagem tipo) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoPostagem getTipo() {
        return tipo;
    }

    public void setTipo(TipoPostagem tipo) {
        this.tipo = tipo;
    }
}
