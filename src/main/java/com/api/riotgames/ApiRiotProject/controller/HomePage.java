package com.api.riotgames.ApiRiotProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

    @GetMapping("/home")
    public String homePage(){
        return "home";
    }

}
