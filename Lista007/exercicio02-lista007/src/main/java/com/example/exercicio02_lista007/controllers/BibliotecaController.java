package com.example.exercicio02_lista007.controllers;

import com.example.exercicio02_lista007.models.Emprestimo;
import com.example.exercicio02_lista007.models.Livro;
import com.example.exercicio02_lista007.services.BibliotecaService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    private final BibliotecaService service;

    public BibliotecaController(BibliotecaService service) {
        this.service = service;
    }

    @GetMapping("/livros")
    public List<Livro> listarLivrosDisponiveis() {
        return service.getLivrosDisponiveis();
    }

    @GetMapping("/emprestados")
    public List<Emprestimo> listarEmprestimosAtivos() {
        return service.getEmprestimosAtivos();
    }

    @PostMapping("/emprestados")
    public ResponseEntity<?> criarEmprestimo(@RequestBody Map<String, String> body) {
        try {
            UUID livroId = UUID.fromString(body.get("livroId"));
            String usuarioId = body.get("usuarioId");

            Optional<Emprestimo> emprestimo = service.criarEmprestimo(livroId, usuarioId);

            if(emprestimo.isEmpty()) {
                return ResponseEntity.badRequest().body("Livro não encontrado ou indisponível");
            }

            return ResponseEntity.ok(emprestimo.get());
        } catch(Exception e) {
            return ResponseEntity.badRequest().body("Erro ao processar empréstimo");
        }
    }

    @DeleteMapping("/emprestados/{emprestimoId}")
    public ResponseEntity<String> devolverLivro(@PathVariable UUID emprestimoId) {
        boolean sucesso = service.devolverLivro(emprestimoId);

        if(sucesso) {
            return ResponseEntity.ok("Livro devolvido com sucesso");
        } else {
            return ResponseEntity.badRequest().body("Empréstimo não encontrado");
        }
    }
}
