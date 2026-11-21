package com.smartfood.restaurant.entity;

import com.smartfood.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "restaurant")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

    private String id;

    private String name;

    private String description;

    private String phone;

    private Address address;

    private User owner;

    private boolean active = true;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
