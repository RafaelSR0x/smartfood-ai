package com.smartfood.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record PasswordUpdateDTO(
        @NotBlank(message = "A senha atual é obrigatória")
        @Size(max = 100, min = 5)
        String currentPassword,

        @NotBlank(message = "A nova senha é obrigatória")
        @Size(max = 100, min = 5)
        String newPassword,

        @NotBlank(message = "A confirmação da senha é obrigatória")
        @Size(max = 100, min = 5)
        String confirmPassword
) {
}
