package com.icatapark.jpa.post.repository;

import com.icatapark.jpa.post.entity.Comment;
import com.icatapark.jpa.post.entity.Post;
import com.icatapark.jpa.post.service.PostService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@DataJpaTest
@Import({PostService.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PostRepositoryTest {

    @Autowired
    private PostService postService;
    @Autowired
    private PostRepository postRepository;

    @BeforeAll
    void setup() {
        Post post = new Post();
        post.setTitle("첫 포스트");

        Comment comment1 = new Comment();
        comment1.setComment("첫 댓글~! ");
        comment1.setPost(post);
        post.getComments().add(comment1);

        Comment comment2 = new Comment();
        comment2.setComment("두번째야~");
        post.getComments().add(comment2);
        comment2.setPost(post);

        Post post2 = new Post();
        post2.setTitle("내가 2등~");

        Comment comment3 = new Comment();
        comment3.setComment("좋아요~");
        comment3.setPost(post2);
        post2.getComments().add(comment3);

        Comment comment4 = new Comment();
        comment4.setComment("감사합니다.");
        comment4.setPost(post2);
        post2.getComments().add(comment4);

        Comment comment5 = new Comment();
        comment5.setComment("다음글 기대할께요.");
        comment5.setPost(post2);
        post2.getComments().add(comment5);

        postRepository.save(post);
        postRepository.save(post2);
    }

    @Test
    void testLazy() {
        System.out.println("===== LAZY");
        System.out.println("LAZY : " + postService.findAllComments());
    }

    @Test
    void testEntityGraph() {
        System.out.println("===== EntityGraph");
        System.out.println("EntityGraph : " + postService.findAllCommentsWithEntityGraph());
    }

    @Test
    void testJoinFetch() {
        System.out.println("===== JoinFetch");
        System.out.println("JoinFetch : " + postService.findAllCommentsWithJoinFetch());
    }
}