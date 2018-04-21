package com.example.ging.androidnews.Mode;

import java.util.List;

import javax.xml.transform.Source;

/**
 * Created by alove on 2018/4/21.
 */

public class WebSite {
    public String status;
    private List<Source> sources;

    public WebSite() {
    }

    public WebSite(String status, List<Source> sources) {
        this.status = status;
        this.sources = sources;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Source> getSources() {
        return sources;
    }

    public void setSources(List<Source> sources) {
        this.sources = sources;
    }
}
