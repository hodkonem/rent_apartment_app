package com.mikhail.rent_apartment_app.exception;

public class ExceptionConstant {

    /**
     * Exception constant
     */
    public static final String NONE_UNIQUE_NICKNAME = "Пользователь с таким никнеймом уже существует";
    public static final String NONE_UNIQUE_LOGIN = "Пользователь с таким логином уже существует";
    public static final String NOT_FOUND_LOGIN = "Пользователь с таким логином не существует";
    public static final String WRONG_PASSWORD = "Введён некорректный пароль";
    public static final String GET_LOGIN = "Войдите в систему";

    /**
     * Exception code
     */
    public static final int NONE_UNIQUE_NICKNAME_CODE = 601;
    public static final int NONE_UNIQUE_LOGIN_CODE = 602;
    public static final int NOT_FOUND_LOGIN_CODE = 603;
    public static final int WRONG_PASSWORD_CODE = 604;
    public static final int GET_LOGIN_CODE = 605;

}
