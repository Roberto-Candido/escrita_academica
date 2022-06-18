package com.example.academic_writing.models;

import java.util.List;

public class TopicoSecundario {
    private List<String> topicoSecundario;
    private List<String> comentarios;

    public List<String> getTopicoSecundario() {
        return topicoSecundario;
    }

    public void setTopicoSecundario(List<String> topicoSecundario) {
        this.topicoSecundario = topicoSecundario;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
