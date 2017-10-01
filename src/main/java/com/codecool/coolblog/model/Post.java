package com.codecool.coolblog.model;

/**
 * Created by ehantul on 2017-09-30.
 */
public class Post {

    private String content;

    public Post(String content) {
        this.content = content;
    }

    public Post() {
        content = "";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
