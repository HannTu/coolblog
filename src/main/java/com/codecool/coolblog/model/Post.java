package com.codecool.coolblog.model;

import java.util.Date;

/**
 * Created by ehantul on 2017-09-30.
 */
public class Post {

    private int postId;
    private String title;
    private String content;
    private Date postedOn;

    public Post(int postId, String title, String content, Date postedOn) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.postedOn = postedOn;
    }

    public Post() {
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPostedOn() {
        return postedOn;
    }

    public void setPostedOn(Date postedOn) {
        this.postedOn = postedOn;
    }
}
