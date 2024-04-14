package com.example.profile.ProfileService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    int id;
    String item;
    String price;
    String date;
}
