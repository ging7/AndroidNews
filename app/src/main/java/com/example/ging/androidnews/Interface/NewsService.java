package com.example.ging.androidnews.Interface;

import com.example.ging.androidnews.Mode.WebSite;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by alove on 2018/4/21.
 */

public interface NewsService {
    @GET ("v2/sources?language=en&country=us&apiKey=API_KEY")
    Call<WebSite> getSources();
}
