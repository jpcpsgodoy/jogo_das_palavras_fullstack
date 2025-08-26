package com.jogopalavras.backend.repository;

import com.jogopalavras.backend.model.Palavra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PalavraRepository extends JpaRepository<Palavra, Long> {
}
