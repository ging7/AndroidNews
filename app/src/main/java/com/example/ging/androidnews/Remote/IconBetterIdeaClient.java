package com.example.ging.androidnews.Remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alove on 2018/4/21.
 */

public class IconBetterIdeaClient {
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://besticon-demo.herokuapp.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
