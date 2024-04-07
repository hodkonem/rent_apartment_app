package com.mikhail.rent_apartment_app.service.impl;

import com.mikhail.rent_apartment_app.exception.AuthException;
import com.mikhail.rent_apartment_app.model.dto.AuthDTO;
import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;
import com.mikhail.rent_apartment_app.repository.UserInfoRepository;
import com.mikhail.rent_apartment_app.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

import static com.mikhail.rent_apartment_app.constant_app.ApplicationConstant.REGISTRATION_DONE;
import static com.mikhail.rent_apartment_app.exception.ExceptionConstant.*;
import static java.util.Objects.isNull;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserInfoRepository userInfoRepository;


    @Override
    public String getRegistration(UserInfoEntity userInfo) {
        UserInfoEntity userByNickName = userInfoRepository.getUserByNickName(userInfo.getNickName());
        if (!isNull(userByNickName)) {
            throw new AuthException(NONE_UNIQUE_NICKNAME, NONE_UNIQUE_NICKNAME_CODE);
        }

        UserInfoEntity userInfoEntityByLogin = userInfoRepository.getUserInfoEntityByLogin(userInfo.getLogin());
        if (!isNull(userInfoEntityByLogin)) {
            throw new AuthException(NONE_UNIQUE_LOGIN, NONE_UNIQUE_LOGIN_CODE);
        }

        userInfoRepository.save(userInfo);

        return REGISTRATION_DONE;
    }

    @Override
    public String getAuthorisation(AuthDTO authDTO) {
        UserInfoEntity user = userInfoRepository.getUserInfoEntityByLogin(authDTO.getLogin());
        if (isNull(user)) {
            throw new AuthException(NOT_FOUND_LOGIN, NOT_FOUND_LOGIN_CODE);
        }
        if (!authDTO.getPassword().equals(user.getPassword())) {
            throw new AuthException(WRONG_PASSWORD, WRONG_PASSWORD_CODE);
        }
        String token = generateUniqueToken();
        user.setToken(token);
        userInfoRepository.save(user);
        return token;
    }

    private String generateUniqueToken() {
        return UUID.randomUUID().toString() + "|" + LocalDateTime.now().plusDays(1L);
    }

    public void getValidToken(String token) {
        UserInfoEntity userByToken = userInfoRepository.getUserByToken(token);
        if (isNull(userByToken)) {
            throw new AuthException(GET_LOGIN, GET_LOGIN_CODE);
        }
    }
}
