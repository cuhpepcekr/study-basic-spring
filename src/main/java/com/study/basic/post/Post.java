package com.study.basic.post;

import com.study.basic.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 100)
    private String title;
    @Column(length = 100)
    private String content;
    @Column(name = "writer_id")
    private int writerId;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "writer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;
}
