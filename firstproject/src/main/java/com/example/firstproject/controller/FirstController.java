package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    
    @GetMapping("/hi")
    public String nice(Model model){
        model.addAttribute("username", "utout");
        return "greetings";
    }
    @GetMapping("/bye")
    public String byeto(Model model){
        model.addAttribute("username", "utout");
        model.addAttribute("nickname", "꼬북꼬북");
        return "bye";
    }

}
