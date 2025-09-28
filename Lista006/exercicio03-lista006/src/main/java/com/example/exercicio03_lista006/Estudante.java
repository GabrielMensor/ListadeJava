package com.example.exercicio03_lista006;

public class Estudante {
    private String nome;
    private int codigo;
    private String curso;
    private String email;
    private String telefone;

    public Estudante() {}   // Construtor vazio necessário para o Spring desserializar o JSON

    public Estudante(String nome, int codigo, String curso, String email, String telefone) {
        this.nome = nome;
        this.codigo = codigo;
        this.curso = curso;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
