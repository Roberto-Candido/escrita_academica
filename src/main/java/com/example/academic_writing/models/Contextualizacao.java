package com.example.academic_writing.models;

import java.util.List;

public class Contextualizacao {
    private List<String> sequenciaContextualizacao;
    private List<String> contextualizacao;
    private List<String> comentarios;

    public List<String> getSequenciaContextualizacao() {
        return sequenciaContextualizacao;
    }

    public void setSequenciaContextualizacao(List<String> sequenciaContextualizacao) {
        this.sequenciaContextualizacao = sequenciaContextualizacao;
    }

    public List<String> getContextualizacao() {
        return contextualizacao;
    }

    public void setContextualizacao(List<String> contextualizacao) {
        this.contextualizacao = contextualizacao;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
