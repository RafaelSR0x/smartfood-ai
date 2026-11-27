package com.smartfood.restaurant.mapper;

import com.smartfood.restaurant.dto.request.AddressRequestDTO;
import com.smartfood.restaurant.dto.response.AddressResponseDTO;
import com.smartfood.restaurant.entity.Address;

public class AddressMapper {

    public static Address toEntity(AddressRequestDTO dto){
        return new Address(
                null,
                dto.street(),
                dto.number(),
                dto.complement(),
                dto.neighborhood(),
                dto.city(),
                dto.state(),
                dto.zipCode()
        );
    }

    public static AddressResponseDTO toResponseDTO(Address address) {
        return new AddressResponseDTO(
                address.getId(),
                address.getStreet(),
                address.getNumber(),
                address.getComplement(),
                address.getNeighborhood(),
                address.getCity(),
                address.getState(),
                address.getZipCode()
        );
    }

}
