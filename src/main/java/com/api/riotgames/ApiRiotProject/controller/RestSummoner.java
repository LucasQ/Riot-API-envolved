package com.api.riotgames.ApiRiotProject.controller;

import com.api.riotgames.ApiRiotProject.assist.UrlEndPoint;
import com.api.riotgames.ApiRiotProject.entity.RotationPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping("/summoner")
public class RestSummoner {

    UrlEndPoint url = new UrlEndPoint();

    @GetMapping("/freeweek")
    public String test(Model model) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        try {

            RotationPojo rotation = objectMapper.readValue(new URL(url.getUrl()), RotationPojo.class);

            model.addAttribute("rotation", rotation);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "show-fw";
    }
}
