package com.example.bankserviceserver.service;

import com.example.bankserviceserver.model.User;
import com.example.bankserviceserver.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> listUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }


}
