package com.codecool.coolblog.repository;

import com.codecool.coolblog.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by ehantul on 2017-09-30.
 */
@Repository
public class InMemoryPostRepository implements PostRepository {
    private List<Post> posts;
    private int nextAvailableId = 0;

    public InMemoryPostRepository() {
        posts = new ArrayList<>();
    }

    @Override
    public void save(Post post) {
        post.setPostId(nextAvailableId);
        post.setPostedOn(new Date());
        posts.add(post);
        nextAvailableId++;
    }

    @Override
    public List<Post> findAll() {
        return new ArrayList<>(posts);
    }

    @Override
    public Optional<Post> findOneById(int id) {
        return posts
                .stream()
                .filter(p -> p.getPostId() == id)
                .findAny();
    }
}
