CREATE TABLE if not exists user_info
(
    id   int8 primary key,
    nick_name varchar,
    login varchar,
    password varchar,
    parent_city varchar,
    token varchar
);

INSERT INTO user_info(id, nick_name, login, password, parent_city, token)
VALUES (1, 'Petya', 'petr123@mail.ru', 'qwerqwtryeryt', 'New York', '4e141f35-8376-4fa5-bbaf-19d42f7a7b1a|2030-03-25T14:28:45.123456789'),
        (2, 'Liza', 'liza44@gmail.com', 'korol', 'Krasnodar', '8fcf45b7-ec6e-4d36-8a15-9c9ae0c2a8fb|2029-03-25T10:15:30.987654321');

CREATE SEQUENCE user_info_sequence START 3 INCREMENT 1