package com.example.exercicio01_lista009;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/fipe")
public class CarroController {
    private final RestTemplate restTemplate = new RestTemplate();

    @PostMapping("/valor")
    public ResponseEntity getValorFipe(@RequestBody CarroRequest request) {
        
    }
}
