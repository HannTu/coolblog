package com.codecool.coolblog.repository;

import com.codecool.coolblog.model.Post;

import java.util.List;
import java.util.Optional;

/**
 * Created by ehantul on 2017-09-30.
 */
public interface PostRepository {

    void save(Post post);

    List<Post> findAll();

    Optional<Post> findOneById(int id);
}
