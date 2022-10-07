package com.example.QuestionaryProjectSpring.controllers;

import com.example.QuestionaryProjectSpring.dao.AlternativaDAO;
import com.example.QuestionaryProjectSpring.dao.QuestaoDAO;
import com.example.QuestionaryProjectSpring.entities.Alternativa;
import com.example.QuestionaryProjectSpring.entities.Questao;
import com.example.QuestionaryProjectSpring.vo.QuestionarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class QuestaoController {

    @Autowired
    QuestaoDAO dao;

    @Autowired
    AlternativaDAO alternativaDAO;


    @GetMapping("/cadastrar-questao")
    public String cadastrarQuestao(Questao questao, Model model, QuestionarioVO questionarioVO) {
        model.addAttribute("questionario", questionarioVO);

        return "cadastrar-questao";
    }

    @PostMapping("/cadastrar-questao")
    public String cadastrarQUestao(QuestionarioVO questionarioVO) {
        Questao questao = new Questao();

        Alternativa alternativa1 = new Alternativa();
        alternativa1.setTitulo(questionarioVO.getAlternativa1());
        alternativa1.setAlternativaCorreta(questionarioVO.getAlternativa1Correta());
        alternativa1=alternativaDAO.save(alternativa1);

        Alternativa alternativa2 = new Alternativa();
        alternativa2.setTitulo(questionarioVO.getAlternativa2());
        alternativa2.setAlternativaCorreta(questionarioVO.getAlternativa2Correta());
        alternativa2=alternativaDAO.save(alternativa2);

        Alternativa alternativa3 = new Alternativa();
        alternativa3.setTitulo(questionarioVO.getAlternativa3());
        alternativa3.setAlternativaCorreta(questionarioVO.getAlternativa3Correta());
        alternativa3=alternativaDAO.save(alternativa3);

        Alternativa alternativa4 = new Alternativa();
        alternativa4.setTitulo(questionarioVO.getAlternativa4());
        alternativa4.setAlternativaCorreta(questionarioVO.getAlternativa4Correta());
        alternativa4=alternativaDAO.save(alternativa4);

        ArrayList<Alternativa> alternativas = new ArrayList<Alternativa>();
        alternativas.add(alternativa1);
        alternativas.add(alternativa2);
        alternativas.add(alternativa3);
        alternativas.add(alternativa4);

        questao.setQuestao(questionarioVO.getTitulo());
        questao.setAlternativas(alternativas);

        dao.save(questao);

        return "redirect:/cadastrar-questao";
    }

    @GetMapping("/questionario")
    public String listarQuestionario (Model model) {

        model.addAttribute("questao", dao.findAll());

        return "quiz";
    }
}
