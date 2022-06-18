package com.example.academic_writing.models;

import java.util.List;

public class Objetivo {
    private List<String> objetivosGerais;
    private List<String> objetivosEspecificos;
    private List<String> comentarios;

    public List<String> getObjetivosGerais() {
        return objetivosGerais;
    }

    public void setObjetivosGerais(List<String> objetivosGerais) {
        this.objetivosGerais = objetivosGerais;
    }

    public List<String> getObjetivosEspecificos() {
        return objetivosEspecificos;
    }

    public void setObjetivosEspecificos(List<String> objetivosEspecificos) {
        this.objetivosEspecificos = objetivosEspecificos;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
