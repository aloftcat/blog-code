package com.icatapark.jpa.post.entity;

import lombok.*;

import javax.persistence.*;

@Setter@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = "post")
public class Comment {

    @Id
    @GeneratedValue
    private Long id;

    private String comment;

    @ManyToOne
    private Post post;
}

