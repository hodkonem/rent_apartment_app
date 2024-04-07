package com.mikhail.rent_apartment_app.controller;

import com.mikhail.rent_apartment_app.model.dto.AuthDTO;
import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;
import com.mikhail.rent_apartment_app.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.mikhail.rent_apartment_app.constant_app.ApplicationConstant.AUTHORISATION;
import static com.mikhail.rent_apartment_app.constant_app.ApplicationConstant.REGISTRATION;

/*  Контролер авторизации. Здесь происходит регистрация пользователей
 */
@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping(REGISTRATION)
    public String registration(@RequestBody UserInfoEntity userInfo) {
        return authService.getRegistration(userInfo);
    }

    @PostMapping(AUTHORISATION)
    public String authorisation(@RequestBody AuthDTO authDTO) {
    return authService.getAuthorisation(authDTO);
    }
}

