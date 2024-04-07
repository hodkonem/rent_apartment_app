package com.mikhail.rent_apartment_app.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "address_info")
@Entity
@NoArgsConstructor
public class AddressEntity {

    @Id
    @SequenceGenerator(name = "address_infoSequence", sequenceName = "address_info_sequence", allocationSize = 1, initialValue = 3)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_infoSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private String house;

    public AddressEntity(String city, String street, String house) {
        this.city = city;
        this.street = street;
        this.house = house;
    }
}
