package com.example.academic_writing;

import com.example.academic_writing.models.*;

public class TrabalhoAcademicoPresenter {
    private long id;
    private Tema tema;
    private Problema problema;
    private Hipoteses hipoteses;
    private Objetivo objetivo;
    private Referencias referencias;
    private Contextualizacao contextualizacao;
    private EstadoDaArte estadoDaArte;
    private Lacuna lacuna;
    private Justificativa justificativa;
    private Metodologia metodologia;
    private RevisaoDaLiteratura revisaoDaLiteratura;
    private TopicoPrincipal topicoPrincipal;
    private TopicoSecundario topicoSecundario;
    private Conclusoes conclusoes;

    public TrabalhoAcademicoPresenter(TrabalhoAcademico trabalhoAcademico){
        this.id = trabalhoAcademico.getId();
        this.tema = trabalhoAcademico.getTema();
        this.problema = trabalhoAcademico.getProblema();
        this.hipoteses = trabalhoAcademico.getHipoteses();
        this.objetivo = trabalhoAcademico.getObjetivo();
        this.referencias = trabalhoAcademico.getReferencias();
        this.contextualizacao = trabalhoAcademico.getContextualizacao();
        this.estadoDaArte = trabalhoAcademico.getEstadoDaArte();
        this.lacuna = trabalhoAcademico.getLacuna();
        this.justificativa = trabalhoAcademico.getJustificativa();
        this.metodologia = trabalhoAcademico.getMetodologia();
        this.revisaoDaLiteratura = trabalhoAcademico.getRevisaoDaLiteratura();
        this.topicoPrincipal = trabalhoAcademico.getTopicoPrincipal();
        this.topicoSecundario = trabalhoAcademico.getTopicoSecundario();
        this.conclusoes = trabalhoAcademico.getConclusoes();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public Hipoteses getHipoteses() {
        return hipoteses;
    }

    public void setHipoteses(Hipoteses hipoteses) {
        this.hipoteses = hipoteses;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(Objetivo objetivo) {
        this.objetivo = objetivo;
    }

    public Referencias getReferencias() {
        return referencias;
    }

    public void setReferencias(Referencias referencias) {
        this.referencias = referencias;
    }

    public Contextualizacao getContextualizacao() {
        return contextualizacao;
    }

    public void setContextualizacao(Contextualizacao contextualizacao) {
        this.contextualizacao = contextualizacao;
    }

    public EstadoDaArte getEstadoDaArte() {
        return estadoDaArte;
    }

    public void setEstadoDaArte(EstadoDaArte estadoDaArte) {
        this.estadoDaArte = estadoDaArte;
    }

    public Lacuna getLacuna() {
        return lacuna;
    }

    public void setLacuna(Lacuna lacuna) {
        this.lacuna = lacuna;
    }

    public Justificativa getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(Justificativa justificativa) {
        this.justificativa = justificativa;
    }

    public Metodologia getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(Metodologia metodologia) {
        this.metodologia = metodologia;
    }

    public RevisaoDaLiteratura getRevisaoDaLiteratura() {
        return revisaoDaLiteratura;
    }

    public void setRevisaoDaLiteratura(RevisaoDaLiteratura revisaoDaLiteratura) {
        this.revisaoDaLiteratura = revisaoDaLiteratura;
    }

    public TopicoPrincipal getTopicoPrincipal() {
        return topicoPrincipal;
    }

    public void setTopicoPrincipal(TopicoPrincipal topicoPrincipal) {
        this.topicoPrincipal = topicoPrincipal;
    }

    public TopicoSecundario getTopicoSecundario() {
        return topicoSecundario;
    }

    public void setTopicoSecundario(TopicoSecundario topicoSecundario) {
        this.topicoSecundario = topicoSecundario;
    }

    public Conclusoes getConclusoes() {
        return conclusoes;
    }

    public void setConclusoes(Conclusoes conclusoes) {
        this.conclusoes = conclusoes;
    }
}
