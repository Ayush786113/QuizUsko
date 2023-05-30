package com.quizapptelusko2M;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller implements ErrorController {

    @Autowired
    Service service;

    @GetMapping(value = "/")
    public String home(){
        return "home";
    }

    @GetMapping(value = "/admin")
    public String admin(Model model){
        model.addAttribute("Question", new Question(null, null, null, null, null, null, null));
        return "admin";
    }

    @PostMapping(value = "/submit")
    public String submitQuestion(@ModelAttribute("Question") Question question, Model model){
        service.addQuestion(question);
        model.addAttribute("Question", new Question(null, null, null, null, null, null, null));
        return "admin";
    }

    @GetMapping(value = "/play")
    public String play(Model model){
        Question question = service.getOneQuestion();
        model.addAttribute("qna", question);
        return "play";
    }
}
