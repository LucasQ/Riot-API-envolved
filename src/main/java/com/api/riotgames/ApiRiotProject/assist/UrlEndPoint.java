package com.api.riotgames.ApiRiotProject.assist;

public class UrlEndPoint {

    private String key = "RGAPI-450f7cca-d316-49c7-afeb-30318d27c793";

    public String getUrl(){

        StringBuffer stringBuffer = new StringBuffer();

        String url = "https://br1.api.riotgames.com/lol/platform/v3/champion-rotations?api_key=";

        stringBuffer.append(url);
        stringBuffer.append(key);

        return stringBuffer.toString();
    }


    public String urlSummoner(String nickName){

        StringBuffer stringBuffer = new StringBuffer();

        String body = "https://br1.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + nickName + "?api_key=";

        stringBuffer.append(body);
        stringBuffer.append(key);

        return stringBuffer.toString();
    }

    public String urlChampMastery(String summonerId){

        StringBuffer stringBuffer = new StringBuffer();

        String body = "https://br1.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/" + summonerId +
                "?api_key=";

        stringBuffer.append(body);
        stringBuffer.append(key);

        return stringBuffer.toString();
    }

}
