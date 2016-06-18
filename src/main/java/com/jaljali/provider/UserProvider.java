package com.jaljali.provider;

import com.jaljali.domain.User;
import com.jaljali.domain.dto.UserDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by music on 2016. 6. 12..
 */
public interface UserProvider {

    /**
     * 사용자 정보 생성
     * @param user
     */
    void create(User user);

    /**
     * 사용자 정보 수정
     * 사용자 전체 정보를 조회해 수정 화면에 뿌려주고 전체를 가져올 것
     * @param user
     */
    void update(User user);

    /**
     * 비밀번호 변경
     * @param id
     * @param password
     */
    void updatePassword(Long id, String password);

    /**
     * 이메일 조회
     * @param id
     * @return
     */
    String readEmail(Long id);

    /**
     * 사용자 조회
     * @param id
     */
    User read(Long id);

    /**
     * 사용자 DTO 조회
     * @param id
     * @return
     */
    UserDto readDto(Long id);
}
