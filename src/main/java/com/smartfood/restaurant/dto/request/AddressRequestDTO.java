package com.smartfood.restaurant.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AddressRequestDTO(

        @NotBlank
        @Size(max = 150)
        String street,

        @NotBlank
        @Size(max =20)
        String number,

        @Size(max = 100)
        String complement,

        @NotBlank
        @Size(max = 100)
        String neighborhood,

        @NotBlank
        @Size(max = 100)
        String city,

        @NotBlank
        @Size(max = 2)
        String state,

        @NotBlank
        @Size(max = 9)
        String zipCode
) { }
