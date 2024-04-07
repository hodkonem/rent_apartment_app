package com.mikhail.rent_apartment_app.service;

import com.mikhail.rent_apartment_app.model.dto.AuthDTO;
import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;

public interface AuthService {

    String getRegistration(UserInfoEntity userInfo);

    String getAuthorisation(AuthDTO authDTO);

   void getValidToken(String token);

}
