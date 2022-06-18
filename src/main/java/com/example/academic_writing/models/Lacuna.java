package com.example.academic_writing.models;

import java.util.List;

public class Lacuna {
    private List<String> lacunas;
    private List<String> comentarios;

    public List<String> getLacunas() {
        return lacunas;
    }

    public void setLacunas(List<String> lacunas) {
        this.lacunas = lacunas;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
