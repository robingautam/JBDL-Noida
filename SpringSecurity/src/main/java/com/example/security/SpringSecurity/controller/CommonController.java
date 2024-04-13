package com.example.security.SpringSecurity.controller;

import com.example.security.SpringSecurity.model.User;
import com.example.security.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class CommonController {

    @Autowired
    UserService userService;

    @GetMapping
    @RequestMapping("/public/data")
    public String data(){
        return "Inside Public Data() Method";
    }

    @GetMapping
    @RequestMapping("/normal/data")
    public String normalData(){
        return "Inside Normal Method";
    }


    @GetMapping
    @RequestMapping("/admin/data")
    public String adminData(){
        return "Inside Admin Method";
    }

    @PostMapping
    @RequestMapping("/create/user")
    public boolean createUser(@RequestBody(required = false) User user){
        userService.createUser(user);
        return true;
    }


}
