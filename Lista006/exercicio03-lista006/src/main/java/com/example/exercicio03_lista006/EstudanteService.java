package com.example.exercicio03_lista006;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudanteService {
    private final List<Estudante> estudantes = new ArrayList<>();

    public Estudante adicionarEstudante(Estudante estudante) {
        estudantes.add(estudante);
        return estudante;
    }

    public List<Estudante> listarEstudantes() {
        return estudantes;
    }

    public Estudante buscarPorCodigo(int codigo) {
        return estudantes.stream()  // cria um fluxo, permitindo um tipo de "iteração" pela lista
                .filter(e -> e.getCodigo() == codigo)   // retorna true se o codigo do estudante for igual ao que se procura
                .findFirst()    // pega o primeiro estudante que passou pelo filtro
                .orElse(null);  // se não encontrou nenhum estudante retorna null
    }
}
