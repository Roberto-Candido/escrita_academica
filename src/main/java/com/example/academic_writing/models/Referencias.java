package com.example.academic_writing.models;

import java.util.List;

public class Referencias {
    private List<String> referenciasCompletas;
    private List<String> referenciasResumidas;
    private List<String> comentarios;

    public List<String> getReferenciasCompletas() {
        return referenciasCompletas;
    }

    public void setReferenciasCompletas(List<String> referenciasCompletas) {
        this.referenciasCompletas = referenciasCompletas;
    }

    public List<String> getReferenciasResumidas() {
        return referenciasResumidas;
    }

    public void setReferenciasResumidas(List<String> referenciasResumidas) {
        this.referenciasResumidas = referenciasResumidas;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
