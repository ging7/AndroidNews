package com.example.ging.androidnews.Common;

import com.example.ging.androidnews.Interface.IconBetterIdeaService;
import com.example.ging.androidnews.Interface.NewsService;
import com.example.ging.androidnews.Remote.IconBetterIdeaClient;
import com.example.ging.androidnews.Remote.RetrofitClient;

/**
 * Created by alove on 2018/4/21.
 */

public class Common {
    private static final String BASE_URL="https://newsapi.org/";

    public static final String API_KEY= "094d936b44b5479890eb4748a71a1d88";

    public static NewsService getNewsService(){
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService(){
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }
}
