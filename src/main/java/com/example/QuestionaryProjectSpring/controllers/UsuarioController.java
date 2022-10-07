package com.example.QuestionaryProjectSpring.controllers;

import com.example.QuestionaryProjectSpring.dao.UsuarioDAO;
import com.example.QuestionaryProjectSpring.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    UsuarioDAO dao;

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastrar-usuario")
    public String cadastrarUsuario(Usuario usuario) {
        return "cadastrar-usuario";
    }

    @PostMapping("/cadastrar-usuario")
    public String salvarUsuario(Usuario usuario) {
        dao.save(usuario);

        return "redirect:/";
    }
}
