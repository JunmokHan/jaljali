package com.jaljali.service;

import com.jaljali.domain.User;
import com.jaljali.domain.dto.UserDto;
import com.jaljali.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by music on 2016. 6. 15..
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserProvider userProvider;

    @Override
    public void create(User user) {
        userProvider.create(user);
    }

    @Override
    public void update(User user) {
        userProvider.update(user);
    }

    @Override
    public void updatePassword(Long id, String password) {
        userProvider.updatePassword(id, password);
    }

    @Override
    public String readEmail(Long id) {
        return userProvider.readEmail(id);
    }

    @Override
    public User read(Long id) {
        return userProvider.read(id);
    }

    @Override
    public UserDto readDto(Long id) {
        return userProvider.readDto(id);
    }
}
