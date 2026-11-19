package com.smartfood.user.service;

import com.smartfood.user.dto.UserRequestDTO;
import com.smartfood.user.entity.User;
import com.smartfood.user.entity.enums.UserRole;
import com.smartfood.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class AuthenticationService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User userRegister(UserRequestDTO data) {

        if (this.userRepository.findByEmail(data.email()) != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "Este email já existe.");
        }

        String encryptedPassword = passwordEncoder.encode(data.password());

        User newUser = new User( data.name(),data.email(), encryptedPassword, UserRole.CUSTOMER);

        return userRepository.save(newUser);
    }
}
