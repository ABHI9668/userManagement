package com.example.user.Management.controller;

import com.example.user.Management.model.User;
import com.example.user.Management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("adduser")
    String addUser(@RequestBody User user){
        return userService.createUsers(user);
    }

    @DeleteMapping("deleteUser/userId")
    String deleteUser(@RequestParam User user){
        return userService.deleteUser(user);
    }
}
