package com.pfh.foro_hub.dto; // Asegúrate de que el paquete sea correcto

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank // Esta anotación asegura que el campo no esté vacío
    private String username;

    @NotBlank // Esta anotación asegura que el campo no esté vacío
    private String password;

    // Constructor vacío (opcional, pero recomendado)
    public LoginRequest() {}

    // Getters y Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}