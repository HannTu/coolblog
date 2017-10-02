package com.codecool.coolblog.controller;

import com.codecool.coolblog.model.Post;
import com.codecool.coolblog.repository.PostRepository;
import com.codecool.coolblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by ehantul on 2017-09-30.
 */
@Controller
@RequestMapping("/posts")
public class PostsController {

    private PostRepository postRepository;
    private PostService postService;

    @Autowired
    public PostsController(PostRepository postRepository, PostService postService) {
        this.postRepository = postRepository;
        this.postService = postService;
    }

    @GetMapping("/")
    public String getPosts(Model model) {
        List<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "posts";
    }

    @GetMapping("/add")
    public String getNewPostForm(Model model) {
        model.addAttribute("newPost", new Post());
        return "newPost";
    }

    @PostMapping("/add")
    public String submitPost(@ModelAttribute("newPost") Post postWithContent) {
        postRepository.save(postWithContent);
        return "redirect:/posts/";
    }

    @GetMapping("/show/{id}")
    public String getPostById(@PathVariable int id, Model model) {
        Optional<Post> post = postRepository.findOneById(id);
        if (post.isPresent()) {
            postService.addPostAndItsElementsToModel(model, post.get());
            return "singlePostView";
        } else {
            return "noSuchPostView";
        }
    }
}
