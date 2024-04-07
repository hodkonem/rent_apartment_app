package com.mikhail.rent_apartment_app.service;

import com.mikhail.rent_apartment_app.model.dto.RegistrationApartmentDTO;
import com.mikhail.rent_apartment_app.model.entity.ApartmentEntity;

import java.util.List;

public interface RentApartmentService {

    String registrationApartment(RegistrationApartmentDTO apartmentDTO);

    List<ApartmentEntity> showApartmentById(Long id);

    List<ApartmentEntity> showApartmentByLocation(String latitude, String longitude);
}
