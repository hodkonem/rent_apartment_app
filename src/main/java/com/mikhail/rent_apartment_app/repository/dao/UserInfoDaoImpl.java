package com.mikhail.rent_apartment_app.repository.dao;

import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserInfoDaoImpl implements UserInfoDao {

    private final QueryPool queryPool;

    private final JdbcTemplate jdbcTemplate;

    @Override
    public UserInfoEntity getUserByNickName(String nickName) {

        UserInfoEntity userInfoEntity = jdbcTemplate.queryForObject(queryPool.getQueryUserInfoByNickName(nickName),
                new BeanPropertyRowMapper<>(UserInfoEntity.class));
        return userInfoEntity;
    }
}
