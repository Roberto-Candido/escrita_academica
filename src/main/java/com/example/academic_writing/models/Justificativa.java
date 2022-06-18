package com.example.academic_writing.models;

import java.util.List;

public class Justificativa {
    private List<String> justificativas;
    private List<String> comentarios;

    public List<String> getJustificativas() {
        return justificativas;
    }

    public void setJustificativas(List<String> justificativas) {
        this.justificativas = justificativas;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
