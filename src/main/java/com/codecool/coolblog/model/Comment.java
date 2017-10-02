package com.codecool.coolblog.model;

/**
 * Created by ehantul on 2017-10-02.
 */
public class Comment {

    private int commentId;
    private int postId;
    private String content;

    public Comment() {
    }

    public Comment(int postId, String content) {
        this.postId = postId;
        this.content = content;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
