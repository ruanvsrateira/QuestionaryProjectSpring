package com.example.QuestionaryProjectSpring.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Alternativa {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private Boolean alternativaCorreta;

    @ManyToOne
    @JoinColumn(name="questao_id")
    private Questao questao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getAlternativaCorreta() {
        return alternativaCorreta;
    }

    public void setAlternativaCorreta(Boolean alternativaCorreta) {
        this.alternativaCorreta = alternativaCorreta;
    }
}
