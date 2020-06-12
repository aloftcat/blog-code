package com.icatapark.jpa.post.repository;

import com.icatapark.jpa.post.entity.Post;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Column;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    @EntityGraph(attributePaths = {"comments"})
    @Query("select p from Post p")
    List<Post> findAllCommentsWithEntityGraph();

    @Query("select p from Post p join fetch p.comments")
    List<Post> findAllCommentsWithJoinFetch();
}
