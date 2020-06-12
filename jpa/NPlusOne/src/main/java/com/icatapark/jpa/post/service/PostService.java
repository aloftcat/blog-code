package com.icatapark.jpa.post.service;

import com.icatapark.jpa.post.repository.PostRepository;
import com.icatapark.jpa.post.entity.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional(readOnly = true)
    public List<String> findAllComments() {
        return getAllComments(postRepository.findAll());
    }

    @Transactional(readOnly = true)
    public List<String> findAllCommentsWithEntityGraph() {
        return getAllComments(postRepository.findAllCommentsWithEntityGraph());
    }

    @Transactional(readOnly = true)
    public List<String> findAllCommentsWithJoinFetch() {
        return getAllComments(postRepository.findAllCommentsWithJoinFetch());
    }

    /**
     * Lazy Load를 실행하기 위해 모든 comment 순회
     */
    private List<String> getAllComments(List<Post> posts) {
        return posts.stream()
                .map(a -> a.getComments().toString())
                .collect(Collectors.toList());
    }

}