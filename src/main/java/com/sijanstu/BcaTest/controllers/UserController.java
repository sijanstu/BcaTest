package com.sijanstu.BcaTest.controllers;

import com.sijanstu.BcaTest.entities.User;
import com.sijanstu.BcaTest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable("id") Long id) {
        if (userRepository.getById(id) == null) {
            return ResponseEntity.status(403).body("User not found");
        } else {
            return ResponseEntity.ok(userRepository.getById(id));
        }
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        if (userRepository.getById(id) == null) {
            return ResponseEntity.status(403).body("User not found");
        } else {
            User existingUser = userRepository.getById(id);
            existingUser.setUsername(user.getUsername());
            existingUser.setPassword(user.getPassword());
            return ResponseEntity.ok(userRepository.save(existingUser));
        }
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("User deleted");
    }

}
