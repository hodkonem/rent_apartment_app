CREATE table integration_info
(
    id  varchar primary key,
    url varchar,
    key varchar
);

INSERT INTO integration_info(id, url, key)
VALUES ('GEO', 'https://api.opencagedata.com/geocode/v1/json?q=%s+%s&key=%s','ab0d7b865ca24ccfbf7e97cd48f8ba42');