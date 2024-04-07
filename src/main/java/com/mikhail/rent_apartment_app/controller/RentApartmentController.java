package com.mikhail.rent_apartment_app.controller;

import com.mikhail.rent_apartment_app.model.dto.RegistrationApartmentDTO;
import com.mikhail.rent_apartment_app.model.dto.RequestShowParamDTO;
import com.mikhail.rent_apartment_app.model.entity.ApartmentEntity;
import com.mikhail.rent_apartment_app.service.RentApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RentApartmentController {

    private final RentApartmentService apartmentService;

    @PostMapping("/apartment_registration")
    public String registrationNewApartment(@RequestBody RegistrationApartmentDTO apartmentDTO) {
        return apartmentService.registrationApartment(apartmentDTO);
    }
    @PostMapping("/show_apartment")
    public List<ApartmentEntity> showApartment(@RequestBody RequestShowParamDTO showParamDTO) {
        return apartmentService.showApartmentById(showParamDTO.getId());
    }
}
