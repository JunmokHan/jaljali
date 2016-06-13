package com.jaljali.mapper;

import com.jaljali.domain.User;
import org.apache.ibatis.annotations.Param;

/**
 * 사용자 userMapper
 */
public interface PostMapper {

    void create(User user);

    /**
     * 사용자 정보 수정
     * 사용자 전체 정보를 조회해 수정 화면에 뿌려주고 전체를 가져올 것
     * @param user
     */
    void update(User user);

    // TODO : 비밀번호 개별 변경
    void updatePassword(@Param("id") Long id, @Param("password") String password);

    // TODO : 메일 조회
    String readEmail(@Param("email") String email);

    // TODO :
}
