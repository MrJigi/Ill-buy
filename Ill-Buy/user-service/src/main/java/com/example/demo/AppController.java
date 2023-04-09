package com.example.demo;


import com.example.demo.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

//    @Autowired
//    private UserService userService;

    @RequestMapping("/")
    public String fallBackResponse(){
        return "Page is not available, ";
    }

}
