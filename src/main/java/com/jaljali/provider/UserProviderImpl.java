package com.jaljali.provider;

import com.jaljali.domain.User;
import com.jaljali.domain.dto.UserDto;
import com.jaljali.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by music on 2016. 6. 15..
 */
@Repository
public class UserProviderImpl implements UserProvider{

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(User user) {
        userMapper.create(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void updatePassword(Long id, String password) {
        // TODO : 암호화
        userMapper.updatePassword(id, password);
    }

    @Override
    public String readEmail(Long id) {
        // TODO : 복호화
        return userMapper.readEmail(id);
    }

    @Override
    public User read(Long id) {
        return userMapper.read(id);
    }

    @Override
    public UserDto readDto(Long id) {
        return userMapper.readDto(id);
    }
}
