package com.codecool.coolblog.repository;

import com.codecool.coolblog.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ehantul on 2017-09-30.
 */
@Repository
public class InMemoryPostRepository implements PostRepository {
    private List<Post> posts;

    public InMemoryPostRepository(){
        posts = new ArrayList<>();
    }

    @Override
    public void save(Post post) {
        posts.add(post);
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(posts);
    }
}
