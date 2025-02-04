package com.vedait.springbootproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vedait.springbootproject.models.DoctorModel;
import com.vedait.springbootproject.models.UserModel;
import com.vedait.springbootproject.services.DoctorService;
import com.vedait.springbootproject.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<UserModel> getAllUsers() {
        List<UserModel> users = userService.getAllUsers();
        return users;
    }

    @GetMapping("/{id}")
    public UserModel getDoctorById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public void addDoctor(@RequestBody UserModel userModel) {
    	userService.addUser(userModel);
    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable int id, @RequestBody UserModel userModel) {
    	userService.updateUser(id, userModel);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {
    	userService.deleteUser(id);
    }
}
