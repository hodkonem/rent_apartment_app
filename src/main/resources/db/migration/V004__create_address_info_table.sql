CREATE TABLE address_info
(
    id int8 primary key,
    city varchar,
    street varchar,
    house varchar
);

INSERT INTO address_info(id, city, street, house)
VALUES (1, 'Moscow', 'Lenina', '15'),
       (2, 'London', 'Briton beach', '1');

CREATE SEQUENCE address_info_sequence START  3 INCREMENT 1