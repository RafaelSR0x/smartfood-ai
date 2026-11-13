package com.smartfood.user.dto;

import com.smartfood.user.entity.User;

import java.time.LocalDateTime;

public record UserResponseDTO(
        String name,
        String email,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
    public static UserResponseDTO fromEntity(User user) {
        return new UserResponseDTO(
                user.getName(),
                user.getEmail(),
                user.getUpdatedAt(),
                user.getCreatedAt()
        );
    }
}
