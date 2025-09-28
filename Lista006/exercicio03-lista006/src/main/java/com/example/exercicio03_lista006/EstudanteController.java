package com.example.exercicio03_lista006;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudantes")
public class EstudanteController {
    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    // endpoint POST que recebe um JSON com os dados de um estudante e o salva em memória
    @PostMapping
    public Estudante adicionar(@RequestBody Estudante estudante) {
        return estudanteService.adicionarEstudante(estudante);
    }

    // endpoint GET que retorna todos os estudantes cadastrados
    @GetMapping
    public List<Estudante> listar() {
        return estudanteService.listarEstudantes();
    }

    // endpoint GET que retorna um estudante pelo seu codigo
    @GetMapping("/{codigo}")
    public Estudante buscarPorCodigo(@PathVariable int codigo) {
        return estudanteService.buscarPorCodigo(codigo);
    }
}
