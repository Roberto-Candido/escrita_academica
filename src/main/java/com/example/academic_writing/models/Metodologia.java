package com.example.academic_writing.models;

import java.util.List;

public class Metodologia {
    private List<String> metodologias;
    private List<String> comentarios;

    public List<String> getMetodologias() {
        return metodologias;
    }

    public void setMetodologias(List<String> metodologias) {
        this.metodologias = metodologias;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
