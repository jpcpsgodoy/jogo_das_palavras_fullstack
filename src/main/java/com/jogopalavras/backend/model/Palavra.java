package com.jogopalavras.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "palavras") 
public class Palavra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String palavra;
    private String dica;

    // Getter e Setter para 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter e Setter para 'palavra'
    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    // Getter e Setter para 'dica'
    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }
}
