package com.smartfood.restaurant.service;

import com.smartfood.restaurant.dto.request.RestaurantRequestDTO;
import com.smartfood.restaurant.entity.Restaurant;
import com.smartfood.restaurant.mapper.RestaurantMapper;
import com.smartfood.restaurant.repository.RestaurantRepository;
import com.smartfood.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository repository;

    public Restaurant createRestaurant(RestaurantRequestDTO data, User owner) {
        Restaurant restaurant = RestaurantMapper.toEntity(data);

        restaurant.assignOwner(owner);

        return repository.save(restaurant);
    }
}
