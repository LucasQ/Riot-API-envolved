package com.api.riotgames.ApiRiotProject.pojoclass;

import com.api.riotgames.ApiRiotProject.Service.ChampIdTranslate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RotationPojo {

    private List<Integer> freeChampionIds = new ArrayList<>();
    private List<Integer> freeChampionIdsForNewPlayers = new ArrayList<>();
    private int maxNewPlayerLevel;

    private List<String> freeChampByName = new ArrayList<>();
    private List<String> freeChampForNewPlayersByName = new ArrayList<>();

    ChampIdTranslate champId = new ChampIdTranslate();


    public List<String> getFreeChampByName() {
        return freeChampByName;
    }

    public List<String> getFreeChampForNewPlayersByName() {
        return freeChampForNewPlayersByName;
    }

    public List<Integer> getFreeChampionIds() {
        return freeChampionIds;
    }

    public void setFreeChampionIds(List<Integer> freeChampionIds) {
        this.freeChampionIds = freeChampionIds;

        for (int temp : freeChampionIds) {
            freeChampByName.add(champId.idToName(temp));
        }
    }

    public List<Integer> getFreeChampionIdsForNewPlayers() {
        return freeChampionIdsForNewPlayers;
    }

    public void setFreeChampionIdsForNewPlayers(List<Integer> freeChampionIdsForNewPlayers) {
        this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;

        for (int temp : freeChampionIdsForNewPlayers) {
            freeChampForNewPlayersByName.add(champId.idToName(temp));
        }
    }

    public int getMaxNewPlayerLevel() {
        return maxNewPlayerLevel;
    }

    public void setMaxNewPlayerLevel(int maxNewPlayerLevel) {
        this.maxNewPlayerLevel = maxNewPlayerLevel;
    }

    @Override
    public String toString() {
        return "RotationPojo{" +
                "freeChampionIds=" + freeChampionIds +
                ", freeChampionIdsForNewPlayers=" + freeChampionIdsForNewPlayers +
                ", maxNewPlayerLevel=" + maxNewPlayerLevel +
                '}';
    }

    public RotationPojo(){}

}
