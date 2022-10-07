package com.example.QuestionaryProjectSpring.entities;

import net.bytebuddy.implementation.bind.annotation.Default;

import javax.persistence.*;

@Entity
public class Usuario {
    @Id()
    @Column()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column()
    private String nome;

    @Column()
    private String email;

    @Column()
    private Integer pontuacao = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }
}
