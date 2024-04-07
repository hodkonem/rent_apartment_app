package com.mikhail.rent_apartment_app.repository;

import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, Long> {

    UserInfoEntity getUserInfoEntityByNickName(String nickName);

    UserInfoEntity getUserInfoEntityByLogin(String login);


    @Query(nativeQuery = true, value = "SELECT * FROM user_info WHERE nick_name = :nickName")
    UserInfoEntity getUserByNickName(String nickName);



}
