package com.mikhail.rent_apartment_app.service.impl;

import com.mikhail.rent_apartment_app.mapper.RentApartmentMapper;
import com.mikhail.rent_apartment_app.model.dto.RegistrationApartmentDTO;
import com.mikhail.rent_apartment_app.model.entity.AddressEntity;
import com.mikhail.rent_apartment_app.model.entity.ApartmentEntity;
import com.mikhail.rent_apartment_app.repository.AddressInfoRepository;
import com.mikhail.rent_apartment_app.repository.ApartmentInfoRepository;
import com.mikhail.rent_apartment_app.service.RentApartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.mikhail.rent_apartment_app.constant_app.ApplicationConstant.REGISTRATION_APARTMENT;

@Service
@RequiredArgsConstructor
public class RentApartmentServiceImpl implements RentApartmentService {

    private final AddressInfoRepository addressInfoRepository;
    private final ApartmentInfoRepository apartmentInfoRepository;
    private final RentApartmentMapper rentApartmentMapper;

    @Override
    public String registrationApartment(RegistrationApartmentDTO apartmentDTO) {
        AddressEntity addressEntity = rentApartmentMapper.prepareAddressForSaveToBase(apartmentDTO);
        addressInfoRepository.save(addressEntity);
        ApartmentEntity apartmentEntity = rentApartmentMapper.prepareApartmentForSaveToBase(apartmentDTO);
        apartmentInfoRepository.save(apartmentEntity);
        return REGISTRATION_APARTMENT;
    }

    public List<ApartmentEntity> showApartmentById(Long id) {
        List<ApartmentEntity> apartments = new ArrayList<>();
        ApartmentEntity apartmentEntity = apartmentInfoRepository.findById(id).get();
        apartments.add(apartmentEntity);
        return  apartments;
    }

   public  List<ApartmentEntity>  showApartmentByLocation(String latitude, String longitude){
        return null;
   }
}
