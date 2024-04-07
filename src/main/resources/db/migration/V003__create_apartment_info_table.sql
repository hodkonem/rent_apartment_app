CREATE TABLE if not exists apartment_info
(
    id int8 primary key,
    rooms varchar,
    price varchar,
    availability boolean,
    date_of_registration timestamp
);

INSERT INTO apartment_info(id, rooms, price, availability, date_of_registration)
VALUES (1, '3', '3000', 'true', '2024-03-25T14:28:45.123456789'),
       (2, '2', '1500', 'true', '2024-03-25T10:15:30.987654321');

CREATE SEQUENCE apartment_info_sequence start 3 INCREMENT 1