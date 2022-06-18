package com.example.academic_writing.models;

import java.util.List;

public class RevisaoDaLiteratura {
    private List<String> revisaoDaLiteratura;
    private List<String> referenciaResumida;
    private List<String> comentarios;

    public List<String> getRevisaoDaLiteratura() {
        return revisaoDaLiteratura;
    }

    public void setRevisaoDaLiteratura(List<String> revisaoDaLiteratura) {
        this.revisaoDaLiteratura = revisaoDaLiteratura;
    }

    public List<String> getReferenciaResumida() {
        return referenciaResumida;
    }

    public void setReferenciaResumida(List<String> referenciaResumida) {
        this.referenciaResumida = referenciaResumida;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
