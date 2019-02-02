package com.api.riotgames.ApiRiotProject.controller;

import com.api.riotgames.ApiRiotProject.pojoclass.RotationPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.net.URL;

@Controller
@RequestMapping("/rotation")
public class RestRotations {

    @GetMapping("/freeweek")
    public String test(Model model) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        String urlRito = "https://br1.api.riotgames.com/lol/platform/v3/champion-rotations?api_key=RGAPI-12748f06-88e4-4184-b3b6-8b36c90c9cc3";

        try {

            RotationPojo rotation = objectMapper.readValue(new URL(urlRito), RotationPojo.class);

            model.addAttribute("rotation", rotation);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "show-fw";
    }
}
