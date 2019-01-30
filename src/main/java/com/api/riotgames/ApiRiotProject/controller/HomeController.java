package com.api.riotgames.ApiRiotProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HomeController {

    @GetMapping
    public String getView(Model model) {
        model.addAttribute("msg", "Hello World");
        return "home";
    }

}
