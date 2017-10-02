package com.codecool.coolblog.repository;

import com.codecool.coolblog.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ehantul on 2017-10-02.
 */
@Repository
public class InMemoryCommentRepository implements CommentRepository {

    private List<Comment> comments;

    private int nextAvailableCommentId = 0;

    public InMemoryCommentRepository() {
        this.comments = new ArrayList<>();
    }

    @Override
    public List<Comment> findAllByPostId(int postId) {
        return comments
                .stream()
                .filter(c -> c.getPostId() == postId)
                .collect(Collectors.toList());
    }

    @Override
    public void save(Comment comment) {
        comment.setCommentId(nextAvailableCommentId);
        nextAvailableCommentId++;
        comments.add(comment);
    }
}