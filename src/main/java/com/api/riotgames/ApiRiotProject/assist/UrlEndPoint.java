package com.api.riotgames.ApiRiotProject.assist;

public class UrlEndPoint {

    StringBuffer stringBuffer = new StringBuffer();

    String url = "https://br1.api.riotgames.com/lol/platform/v3/champion-rotations?api_key=";

    String key = "RGAPI-2556e739-d158-441f-8418-0726b6ecad38";

    public String getUrl(){

        stringBuffer.append(url);
        stringBuffer.append(key);

        return stringBuffer.toString();
    }

}
