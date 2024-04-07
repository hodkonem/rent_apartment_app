package com.mikhail.rent_apartment_app.model.dto;

import lombok.Data;

@Data
public class RegistrationApartmentDTO {
    private String city;
    private String street;
    private String house;
    private String rooms;
    private String price;
}
