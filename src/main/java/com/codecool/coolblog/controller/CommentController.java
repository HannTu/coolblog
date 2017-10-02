package com.codecool.coolblog.controller;

import com.codecool.coolblog.model.Comment;
import com.codecool.coolblog.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ehantul on 2017-10-02.
 */
@Controller
@RequestMapping("/comments")
public class CommentController {

    private CommentRepository commentRepository;

    @Autowired
    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @GetMapping("/add/{postId}")
    public String getNewPostForm(Model model, @PathVariable int postId) {
        Comment newComment = new Comment();
        newComment.setPostId(postId);
        model.addAttribute("newComment", newComment);
        return "newComment";
    }

    @PostMapping("/add/{postId}")
    public String submitPost(@ModelAttribute("newComment") Comment comment,
                             @PathVariable int postId) {
        commentRepository.save(comment);
        return "redirect:/posts/show/" + postId;
    }
}
