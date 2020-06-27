package com.study.basic.post;

import com.study.basic.user.User;
import com.study.basic.user.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostTests {

    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;

    @Test
    public void updateWriterIdInPostTest() {
        List<Post> posts = postRepository.findAll();
        Post post = posts.get(0);
        int preWriterId = post.getWriterId();

        List<User> users = userRepository.findAll();
        User differentUser = null;
        for (User user : users) {
            if (user.getId() != preWriterId) {
                differentUser = user;
                break;
            }
        }

        post.setWriterId(differentUser.getId());
        Post savedPost = postRepository.save(post);
        int nextWriterId = savedPost.getWriterId();

        assertNotEquals(preWriterId, nextWriterId);

        post.setWriterId(preWriterId);
        postRepository.save(post);

    }
}