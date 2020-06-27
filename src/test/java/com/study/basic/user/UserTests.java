package com.study.basic.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {

    @Autowired
    UserRepository userRepository;

    @Test
    public void saveUserTest() {

        List<User> users = userRepository.findAll();
        User lastUser = users.get(users.size() - 1);
        int nextId = lastUser.getId() + 1;
        User inputUser = new User(0, "testusername" + nextId, "testpassword" + nextId, "testname" + nextId);

        User savedUser = userRepository.save(inputUser);

        // inputUser의 id가 0이므로 auto_increment가 적용된다.
        // 저장 후 영속성에 의해 inputUser의 값도 바뀐다.
        assertEquals(inputUser.getId(), savedUser.getId());
    }
}
