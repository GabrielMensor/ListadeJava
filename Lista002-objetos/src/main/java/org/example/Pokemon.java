package org.example;

public class Pokemon {
    private String nome;
    private String tipo;
    private int nivel;

    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void mostrarInfo() {
        System.out.println(nome + "é um Pokémon do tipo " + tipo +  " de nível " + nivel + ".");
    }
}
