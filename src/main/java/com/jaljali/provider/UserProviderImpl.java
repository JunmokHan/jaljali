package com.jaljali.provider;

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

}
