package com.example.QuestionaryProjectSpring.dao;

import com.example.QuestionaryProjectSpring.entities.Questao;
import org.springframework.data.repository.CrudRepository;

public interface QuestaoDAO extends CrudRepository<Questao, Integer> {
}
