package com.jaljali.mapper;

import com.jaljali.config.Mapper;
import com.jaljali.domain.User;
import org.mybatis.spring.annotation.MapperScan;

/**
 * Created by music on 2016. 6. 10..
 */
@Mapper
public interface UserMapper {

    void createUser(User user);

    void updateUser(User user);
}
