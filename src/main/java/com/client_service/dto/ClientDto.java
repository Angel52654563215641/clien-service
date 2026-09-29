package com.client_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClientDto {

    @NotBlank(message = "El nombre completo es obligatorio")
    private String fullName;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El email no tiene un formato válido")
    private String email;

    @NotBlank(message = "El teléfono es obligatorio")
    private String phone;
}