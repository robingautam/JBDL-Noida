package com.example.profile.ProfileService.controller;

import com.example.profile.ProfileService.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @GetMapping
    @RequestMapping("/get/profile/orders/{id}")
    public Person getProfileOrder(@PathVariable("id") int id){
        return profileService.getProfile(id);
    }
}
