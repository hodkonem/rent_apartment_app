package com.mikhail.rent_apartment_app.repository.dao;

import org.springframework.stereotype.Service;

@Service
public class QueryPoolImpl implements QueryPool{

    @Override
    public String getQueryUserInfoByNickName(String nickname) {

        String query = "SELECT * FROM user_info WHERE nick_name = %s";
        return String.format(query, nickname);
    }
}
