package com.example.academic_writing.constansts;

import com.example.academic_writing.models.*;

public class TrabalhoAcademicoNull extends TrabalhoAcademico {

    @Override
    public Tema getTema() {
        return new Tema();
    }

    @Override
    public Problema getProblema() {
        return new Problema();
    }

    @Override
    public Hipoteses getHipoteses() {
        return new Hipoteses();
    }

    @Override
    public Objetivo getObjetivo() {
        return new Objetivo();
    }

    @Override
    public Referencias getReferencias() {
        return new Referencias();
    }

    @Override
    public Contextualizacao getContextualizacao() {
        return new Contextualizacao();
    }

    @Override
    public EstadoDaArte getEstadoDaArte() {
        return new EstadoDaArte();
    }

    @Override
    public Lacuna getLacuna() {
        return new Lacuna();
    }

    @Override
    public Justificativa getJustificativa() {
        return new Justificativa();
    }

    @Override
    public Metodologia getMetodologia() {
        return new Metodologia();
    }

    @Override
    public RevisaoDaLiteratura getRevisaoDaLiteratura() {
        return new RevisaoDaLiteratura();
    }

    @Override
    public TopicoPrincipal getTopicoPrincipal() {
        return new TopicoPrincipal();
    }

    @Override
    public TopicoSecundario getTopicoSecundario() {
        return new TopicoSecundario();
    }

    @Override
    public Conclusoes getConclusoes() {
        return new Conclusoes();
    }
}
