package com.kjlc.app.services.impl;

import org.springframework.stereotype.Service;

import com.kjlc.app.Entity.User;
import com.kjlc.app.config.PasswordEncoderUtil;
import com.kjlc.app.repository.UserRepository;
import com.kjlc.app.services.UserService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository repository;

    @Override
    public User save(User userData) {
        User user;
        if(repository.findByEmail(userData.getEmail()) != null){
            user = repository.findByEmail(userData.getEmail()).get();
        }
        else{
            user = new User();
        }
        user.setRole("USER");
        user.setEmail(userData.getEmail());
        user.setPassword(PasswordEncoderUtil.getInstance().encode(userData.getEmail()));
        repository.save(user);
        return(user);
    }

    @Override
    public User retrieve(Long id) {
        User result = repository.findById(id).get();
        return result;
    }


    
}
