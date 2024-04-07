package com.mikhail.rent_apartment_app.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "apartment_info")
@NoArgsConstructor
public class ApartmentEntity {

    @Id
    @SequenceGenerator(name = "apartment_infoSequence", sequenceName = "apartment_info_sequence", allocationSize = 1, initialValue = 3)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apartment_infoSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "rooms")
    private String rooms;

    @Column(name = "price")
    private String price;

    @Column(name = "availability")
    private boolean availability;

    @Column(name = "dateOfRegistration")
    private LocalDateTime dateOfRegistration;

    public ApartmentEntity(String rooms, String price) {
        this.rooms = rooms;
        this.price = price;
        this.availability = true;
        this.dateOfRegistration = LocalDateTime.now();
    }
}
