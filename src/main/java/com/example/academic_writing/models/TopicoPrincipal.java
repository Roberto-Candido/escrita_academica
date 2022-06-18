package com.example.academic_writing.models;

import java.util.List;

public class TopicoPrincipal {
    private List<String> topicoPrincipal;
    private List<String> comentarios;

    public List<String> getTopicoPrincipal() {
        return topicoPrincipal;
    }

    public void setTopicoPrincipal(List<String> topicoPrincipal) {
        this.topicoPrincipal = topicoPrincipal;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }
}
