package com.example.profile.ProfileService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    int id;
    String name;
    String email;
    List<Order> orderList;
}

