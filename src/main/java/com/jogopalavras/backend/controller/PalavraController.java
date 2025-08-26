package com.jogopalavras.backend.controller;

import com.jogopalavras.backend.model.Palavra;
import com.jogopalavras.backend.repository.PalavraRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/palavras")
public class PalavraController {

    private final PalavraRepository palavraRepository;

    public PalavraController(PalavraRepository palavraRepository) {
        this.palavraRepository = palavraRepository;
    }

    @GetMapping
    public List<Palavra> listarTodas() {
        return palavraRepository.findAll();
    }
}
