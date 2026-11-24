package com.smartfood.restaurant.dto.response;

import java.time.LocalDateTime;

public record RestaurantResponseDTO(

        String id,
        String name,
        String description,
        String phone,
        AddressResponseDTO address,
        boolean active,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) { }
