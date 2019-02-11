package com.api.riotgames.ApiRiotProject.controller;

import com.api.riotgames.ApiRiotProject.assist.UrlEndPoint;
import com.api.riotgames.ApiRiotProject.entity.ChampMasteryPojo;
import com.api.riotgames.ApiRiotProject.entity.RotationPojo;
import com.api.riotgames.ApiRiotProject.entity.SummonerPojo;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/summoner")
public class RestSummoner {

    UrlEndPoint urlEndPoint  = new UrlEndPoint();

    String url = urlEndPoint.getUrl();

    @GetMapping("/freeweek")
    public String freeWeek(Model model) {

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
    public String profileSummoner(@RequestParam("userName") String name, Model model){

        ObjectMapper objectMapper = new ObjectMapper();

        model.addAttribute("atribute",name);

        try {

            SummonerPojo summonerPojo = objectMapper.readValue(new URL(urlEndPoint.urlSummoner(name)), SummonerPojo.class);

            List<ChampMasteryPojo> champPojo = Arrays.asList(objectMapper.readValue(new URL(urlEndPoint.urlChampMastery(
                                                                      summonerPojo.getId())), ChampMasteryPojo[].class));

            model.addAttribute("champMastery", champPojo);
            model.addAttribute("summoner", summonerPojo);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "profile";
    }
}
