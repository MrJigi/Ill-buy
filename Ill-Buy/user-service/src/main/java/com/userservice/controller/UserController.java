package com.userservice.controller;

import com.userservice.dto.User.UserRequest;
import com.userservice.model.Users;
import com.userservice.service.UserService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;



@RestController
//@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

//    public UserController(UserService userService) {
//        this.userService = userService;
//    }

    @Autowired
    public UserController(UserService userService1){
        this.userService = userService1;
    }

    @GetMapping("/getAll")
    public List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/test")
    @ResponseStatus(HttpStatus.OK)
    public void addTest(){
        userService.addTestUsers();
    }

    @GetMapping("/{id}")
    public Users getUserByUUID(@PathVariable UUID id){
        return userService.getUserById(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Users addUser(@RequestBody Users user) {
        return userService.addUser(user);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateUser(@RequestBody Users users) {
        userService.updateUser(users.getUuid(),users);
    }

    @PostMapping(value = "/createUser", consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public void createUser(@RequestBody UserRequest userRequest) {userService.createUser(userRequest); }

    @PostMapping("/createAdmin")
    @ResponseStatus(HttpStatus.CREATED)
    public void createAdmin(@RequestBody UserRequest userRequest) {userService.createAdmin(userRequest); }

    @DeleteMapping("/remove/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteUserById(@PathVariable UUID id) {
        userService.deleteUserById(id);
    }

}
