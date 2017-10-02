package com.codecool.coolblog.repository;

import com.codecool.coolblog.model.Comment;

import java.util.List;

/**
 * Created by ehantul on 2017-10-02.
 */
public interface CommentRepository {

    List<Comment> findAllByPostId(int postId);

    void save(Comment comment);
}
