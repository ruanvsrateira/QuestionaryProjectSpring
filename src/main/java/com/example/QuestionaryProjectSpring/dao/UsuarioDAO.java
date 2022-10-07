package com.example.QuestionaryProjectSpring.dao;

import com.example.QuestionaryProjectSpring.entities.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {}
