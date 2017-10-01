package com.codecool.coolblog.controller;

import com.codecool.coolblog.model.Post;
import com.codecool.coolblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by ehantul on 2017-09-30.
 */
@Controller
@RequestMapping("/posts")
public class PostsController {

    private PostRepository postRepository;

    @Autowired
    public PostsController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/")
    public String getPosts(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "posts";
    }

    @GetMapping("/add")
    public String getNewPostForm(Model model){
        model.addAttribute("newPost", new Post());
        return "newPost";
    }

    @PostMapping("/add")
    public String submitPost(@ModelAttribute("newPost") Post post){
        postRepository.save(post);
        return "redirect:/posts/";
    }
}
