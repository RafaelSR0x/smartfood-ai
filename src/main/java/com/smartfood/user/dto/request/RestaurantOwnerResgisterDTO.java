package com.smartfood.user.dto.request;

import com.smartfood.restaurant.dto.request.RestaurantRequestDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RestaurantOwnerResgisterDTO(
        @NotBlank(message = "O nome é obrigatório")
        @Size(max = 150)
        String name,

        @NotBlank(message = "O email é obrigatório")
        @Email(message = "Formato de email inválido")
        @Size(max = 254)
        String email,

        @NotBlank(message = "A senha é obrigatória")
        @Size(max = 100, min = 5)
        String password,

        @NotNull
        @Valid
        RestaurantRequestDTO restaurantRequestDTO
) {
}
