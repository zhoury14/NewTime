package com.tencent.newtime.model;

import org.json.JSONObject;

/**
 * Created by 晨光 on 2016-07-10.
 */
public class Home {
    public int id;
    public static Home fromJSON(JSONObject j){
        Home a = new Home();
        a.id = j.optInt("id");
        return a;
    }
}