package com.example.academic_writing.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


public class Conclusoes {
    private List<String> conclusoes;
    private List<String> comentarios;

    public List<String> getConclusoes() {
        return conclusoes;
    }

    public void setConclusoes(List<String> conclusoes) {
        this.conclusoes = conclusoes;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
