package com.example.bankserviceserver.controller;

import com.example.bankserviceserver.model.User;
import com.example.bankserviceserver.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/listUser")
    public List<User> users()  {
        return userService.listUsers();
    }

    @GetMapping("/user/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
