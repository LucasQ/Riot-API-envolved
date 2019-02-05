package com.api.riotgames.ApiRiotProject.assist;

public class UrlEndPoint {

    private String key = "RGAPI-100b6f23-4d72-494a-8ade-501dbb541f27";

    public String getUrl(){

        StringBuffer stringBuffer = new StringBuffer();

        String url = "https://br1.api.riotgames.com/lol/platform/v3/champion-rotations?api_key=";

        stringBuffer.append(url);
        stringBuffer.append(key);

        return stringBuffer.toString();
    }


    public String urlSummoner(String nickName){

        StringBuffer stringBuffer = new StringBuffer();

        String body = "https://br1.api.riotgames.com/lol/summoner/v4/summoners/by-name/Urake?api_key=";

        stringBuffer.append(body);
        stringBuffer.append(key);

        return stringBuffer.toString();
    }

}
