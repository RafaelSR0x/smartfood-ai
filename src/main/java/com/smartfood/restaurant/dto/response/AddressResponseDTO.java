package com.smartfood.restaurant.dto.response;

public record AddressResponseDTO(

        String street,

        String number,

        String complement,

        String neighborhood,

        String city,

        String state,

        String zipCode
) { }
