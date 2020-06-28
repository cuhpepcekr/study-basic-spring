package com.study.basic.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class PostController {

    @Autowired
    PostService postService;

    @ResponseBody
    @RequestMapping(value = "/posts", method = RequestMethod.GET)
    public List<Post> getPosts() {
        List<Post> posts = postService.getPosts();

        return posts;
    }

    @ResponseBody
    @RequestMapping(value = "/posts/{id}", method = RequestMethod.GET)
    public Post getPost(@PathVariable("id") int id) {
        Post post = postService.getPost(id);
    
        return post;
    }
}
