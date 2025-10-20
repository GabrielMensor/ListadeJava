package com.example.exercicio02_lista007.services;

import com.example.exercicio02_lista007.models.Emprestimo;
import com.example.exercicio02_lista007.models.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BibliotecaService {
    private final List<Livro> livrosDisponiveis = new ArrayList<>();
    private final List<Emprestimo> emprestimosAtivos = new ArrayList<>();

    public BibliotecaService() {
        livrosDisponiveis.add(new Livro("Dom Casmurro", "Machado de Assis"));
        livrosDisponiveis.add(new Livro("O Hobbit", "J.R.R. Tolkien"));
        livrosDisponiveis.add(new Livro("1984", "George Orwell"));
        livrosDisponiveis.add(new Livro("O Conde de MonteCristo", "Alexandre Dumas"));
    }

    public List<Livro> getLivrosDisponiveis() {
        return livrosDisponiveis;
    }

    public List<Emprestimo> getEmprestimosAtivos() {
        return emprestimosAtivos;
    }

    public Optional<Emprestimo> criarEmprestimo(UUID livroId, String usuarioId) {
        Optional<Livro> livroOpt = livrosDisponiveis.stream()
                .filter(l -> l.getId().equals(livroId))
                .findFirst();
        if (livroOpt.isEmpty()) {   // confirmar se livro existe
            return Optional.empty();
        }

        Livro livro = livroOpt.get();
        livrosDisponiveis.remove(livro);

        Emprestimo emprestimo = new Emprestimo(livro.getId(), usuarioId);
        emprestimosAtivos.add(emprestimo);

        return Optional.of(emprestimo);
    }

    public boolean devolverLivro(UUID emprestimoId) {
        Optional<Emprestimo> emprestimoOpt = emprestimosAtivos.stream()
                .filter(e -> e.getEmprestimoId().equals(emprestimoId))
                .findFirst();

        if (emprestimoOpt.isEmpty()) {
            return false;
        }

        Emprestimo emprestimo = emprestimoOpt.get();
        emprestimosAtivos.remove(emprestimo);

        livrosDisponiveis.add(new Livro("Livro devolvido (ID: " + ")", "Desconhecido"));
        return true;
    }
}
