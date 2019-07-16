package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.net.URL;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    @SerializedName("id")
    private String id;
    @SerializedName("url")
    private URL url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return id+"   " + url.toString();
    }
}
