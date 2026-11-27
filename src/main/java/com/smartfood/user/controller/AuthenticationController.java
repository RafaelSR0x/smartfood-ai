package com.smartfood.user.controller;

import com.smartfood.user.dto.request.AuthenticationDTO;
import com.smartfood.user.dto.request.RestaurantOwnerResgisterDTO;
import com.smartfood.user.dto.request.UserRequestDTO;
import com.smartfood.user.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<Void> register(@Valid @RequestBody UserRequestDTO data) {
        this.service.userRegister(data);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/register/restaurant-owner")
    public ResponseEntity<Void> registerRestaurantOwner(@Valid @RequestBody RestaurantOwnerResgisterDTO data) {
        this.service.registerRestaurantOwner(data);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody @Valid AuthenticationDTO data) {
        var response = this.service.login(data);

        return ResponseEntity.ok(response);
    }
}
