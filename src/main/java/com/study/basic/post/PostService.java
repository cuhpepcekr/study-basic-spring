package com.study.basic.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public List<Post> getPosts() {
        List<Post> posts = postRepository.findAll();

        return posts;
    }

    public Post getPost(int id) {
        Post post = postRepository.findById(id);

        return post;
    }
}
