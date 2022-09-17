package com.khw.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("title", "spring boot 3 and spring 6");
        return "main";
    }
}
