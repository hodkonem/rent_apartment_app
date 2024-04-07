package com.mikhail.rent_apartment_app.repository;

import com.mikhail.rent_apartment_app.model.entity.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApartmentInfoRepository extends JpaRepository<ApartmentEntity, Long> {

}
