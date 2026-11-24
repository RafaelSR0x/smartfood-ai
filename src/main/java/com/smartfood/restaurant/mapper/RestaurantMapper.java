package com.smartfood.restaurant.mapper;

import com.smartfood.restaurant.dto.request.RestaurantRequestDTO;
import com.smartfood.restaurant.dto.response.AddressResponseDTO;
import com.smartfood.restaurant.dto.response.RestaurantResponseDTO;
import com.smartfood.restaurant.entity.Address;
import com.smartfood.restaurant.entity.Restaurant;

public class RestaurantMapper {

    public static Restaurant toEntity(RestaurantRequestDTO dto) {
        Address address = AddressMapper.toEntity(dto.address());
        return new Restaurant(
                null,
                dto.name(),
                dto.description(),
                dto.phone(),
                address,
                null,
                true,
                null,
                null
        );
    }

    public static RestaurantResponseDTO toResponseDTO(Restaurant restaurant) {
        AddressResponseDTO addressResponseDTO = AddressMapper.toResponseDTO(restaurant.getAddress());
        return new RestaurantResponseDTO(
                restaurant.getId(),
                restaurant.getName(),
                restaurant.getDescription(),
                restaurant.getPhone(),
                addressResponseDTO,
                restaurant.isActive(),
                restaurant.getCreatedAt(),
                restaurant.getUpdatedAt()
        );
    }
}
