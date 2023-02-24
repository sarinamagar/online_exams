package com.kjlc.app.services;

import com.kjlc.app.Entity.User;

public interface UserService {
    User save(User user);
    User retrieve(Long id);
}
