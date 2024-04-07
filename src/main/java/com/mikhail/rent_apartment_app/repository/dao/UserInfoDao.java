package com.mikhail.rent_apartment_app.repository.dao;

import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;

public interface UserInfoDao {

    UserInfoEntity getUserByNickName(String nickName);
}
