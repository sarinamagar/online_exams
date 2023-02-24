package com.kjlc.app;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kjlc.app.Entity.User;
import com.kjlc.app.repository.UserRepository;

@DataJpaTest
public class UserRepositoryTest {
    
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest(){
        User user = new User();
        user.setEmail("abcd@gmail.com");
        user.setPassword("abcd");
        user.setRole("USER");
        userRepository.save(user);

        Assertions.assertThat(user.getUserID()).isGreaterThan(0);
    }
    @Test
    public void getUserTest(){

        User user = new User();
        user.setEmail("abcd@gmail.com");
        user.setPassword("abcd");
        user.setRole("USER");
        userRepository.save(user);

        User UserC = userRepository.findById(user.getUserID()).get();

        Assertions.assertThat(UserC.getUserID()).isEqualTo(1);
    }
    @Test
    public void deleteUserTest(){

        User user = new User();
        user.setEmail("abcd@gmail.com");
        user.setPassword("abcd");
        user.setRole("USER");
        userRepository.delete(user);

        Optional<User> UserC = userRepository.findById(user.getUserID());

        Assertions.assertThat(UserC.isPresent());
    }

    @Test
    public void updateUserTest(){

        User user = new User();
        user.setEmail("abcd@gmail.com");
        user.setPassword("abcd");
        user.setRole("USER");
        userRepository.save(user);

        User UserC = userRepository.findById(user.getUserID()).get();
        UserC.setPassword("abcd123");
        userRepository.save(UserC);

        Assertions.assertThat(UserC.getPassword()).isEqualTo("abcd");
    }
}
