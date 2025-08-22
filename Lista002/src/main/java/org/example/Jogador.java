package org.example;

public class Jogador {
    // Atributos
    private String nome = "Neymar";
    private String sobrenome = "Júnior";
    private String clube = "Santos";
    private String posicao = "atacante";
    private Short idade = 33;

    // Construtor
    Jogador(String nome, String sobrenome, String clube, String posicao, Short idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.clube = clube;
        this.posicao = posicao;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Short getIdade() {
        return idade;
    }

    public void setIdade(Short idade) {
        if (idade < 16) {
            this.idade = idade;
        }
    }

    // Método
    void exibeJogador() {
        System.out.println(
                this.nome + " " + this.sobrenome + " é um futebolista brasileiro de "
                        + this.idade + " anos que atua como " + this.posicao
                        + ". Atualmente defende o " + this.clube);
    }
}
