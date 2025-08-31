package org.example;

import java.util.ArrayList;

public class BasePorto {
    private String nome;
    protected ArrayList<Barco> barcosAtracados = new ArrayList<>();

    public BasePorto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Barco> getBarcosAtracados() {
        return barcosAtracados;
    }

    public void setBarcosAtracados(ArrayList<Barco> barcosAtracados) {
        this.barcosAtracados = barcosAtracados;
    }

    public void atracarBarco(Barco barco) {
        this.barcosAtracados.add(barco);
    }

    public void dasatracarBarco(Barco barco) {
        this.barcosAtracados.remove(barco);
    }
}
