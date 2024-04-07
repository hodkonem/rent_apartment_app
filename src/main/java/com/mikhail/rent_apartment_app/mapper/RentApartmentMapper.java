package com.mikhail.rent_apartment_app.mapper;

import com.mikhail.rent_apartment_app.model.dto.RegistrationApartmentDTO;
import com.mikhail.rent_apartment_app.model.entity.AddressEntity;
import com.mikhail.rent_apartment_app.model.entity.ApartmentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface RentApartmentMapper {

    ApartmentEntity prepareApartmentForSaveToBase(RegistrationApartmentDTO value);
    AddressEntity prepareAddressForSaveToBase(RegistrationApartmentDTO value);
}
