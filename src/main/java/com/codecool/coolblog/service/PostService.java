package com.codecool.coolblog.service;

import com.codecool.coolblog.model.Post;
import com.codecool.coolblog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

/**
 * Created by ehantul on 2017-10-02.
 */
@Service
public class PostService {

    private final CommentRepository commentRepository;

    @Autowired
    public PostService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public void addPostAndItsElementsToModel(Model model, Post post) {

        model.addAttribute("post", post);
        model.addAttribute("comments", commentRepository
                .findAllByPostId(post.getPostId()));
    }
}
