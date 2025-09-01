package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis = new ArrayList<>();
    private List<Ingresso> ingressosVendidos = new ArrayList<>();

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public void setFilmesDisponiveis(List<Filme> filmesDisponiveis) {
        this.filmesDisponiveis = filmesDisponiveis;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void setIngressosVendidos(List<Ingresso> ingressosVendidos) {
        this.ingressosVendidos = ingressosVendidos;
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public Filme buscarFilme(String nome) {
        for (Filme f : filmesDisponiveis) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    public void venderIngresso(Cliente cliente, Filme filme, String assento) throws Exception {
        // Verifica idade
        if (cliente.getIdade() <= filme.getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        // Verifica se assento já foi vendido
        for (Ingresso i : ingressosVendidos) {
            if (i.getAssento().equalsIgnoreCase(assento) && i.toString().contains(filme.getNome())) {
                throw new Exception("O ingresso não pode ser vendido pois seu assento não está mais disponível!");
            }
        }

        Ingresso ingresso = new Ingresso(cliente, filme, assento);
        ingressosVendidos.add(ingresso);
        System.out.println("Ingresso vendido com sucesso! " + ingresso);
    }
}
