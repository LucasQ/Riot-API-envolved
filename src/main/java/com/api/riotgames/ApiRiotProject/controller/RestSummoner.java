package com.api.riotgames.ApiRiotProject.controller;

import com.api.riotgames.ApiRiotProject.assist.UrlEndPoint;
import com.api.riotgames.ApiRiotProject.entity.RotationPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping("/summoner")
public class RestSummoner {

    String url = new UrlEndPoint().getUrl();

    @GetMapping("/freeweek")
    public String freeWeek(Model model) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        try {

            RotationPojo rotation = objectMapper.readValue(new URL(url), RotationPojo.class);

            model.addAttribute("rotation", rotation);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "show-fw";
    }

    @GetMapping("/profile")
    public String profileSummoner(@RequestParam("id") String name, Model model){


        model.addAttribute("atribute",name);

        System.out.println("---------      " + name);
        return "profile";
    }
}
