package com.learning.LearningPlatform;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    private UserRepository repo;

    public UserController(UserRepository repo){
        this.repo = repo;
    }

    @PostMapping("/user")
    public void create(@RequestBody User user){
        this.repo.save(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> get(@PathVariable int id){
        return this.repo.findById(id);
    }
}
