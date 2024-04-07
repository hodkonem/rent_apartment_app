package com.mikhail.rent_apartment_app.scheduller;

import com.mikhail.rent_apartment_app.model.entity.UserInfoEntity;
import com.mikhail.rent_apartment_app.repository.UserInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Objects.isNull;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class TokenScheduler {

    private final UserInfoRepository userInfoRepository;


    @Scheduled(fixedRate = 60000)
    public void checkTokenLimit() {
        List<UserInfoEntity> tokens = userInfoRepository.findAll();

        for (UserInfoEntity user : tokens) {
            String token = user.getToken();
            if (!isNull(token)){
                LocalDateTime parseToken = getParseToken(token);
                check(parseToken, user);
            }

        }
    }

    private LocalDateTime getParseToken(String token) {
        int index = token.indexOf("|") + 1;
        String dateStringFormat = token.substring(index);
        LocalDateTime tokenTime = LocalDateTime.parse(dateStringFormat);
        return tokenTime;
    }

    private void check(LocalDateTime localDateTime, UserInfoEntity user) {
        if (localDateTime.isBefore(LocalDateTime.now())) {
            user.setToken(null);
            userInfoRepository.save(user);
        }
    }

//    d108f0c2-c1b3-4815-bf51-9a438310767b|2024-02-19T09:46:00.062570186
}
