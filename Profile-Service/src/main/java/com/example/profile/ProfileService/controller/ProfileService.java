package com.example.profile.ProfileService.controller;

import com.example.profile.ProfileService.model.Order;
import com.example.profile.ProfileService.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {
    static List<Person> personList = new ArrayList<>();

    @Autowired
    RestTemplate restTemplate;

    static  {
        Person p1 = new Person();
        p1.setId(1);
        p1.setName("Robin");
        p1.setEmail("robin@gmail.com");
        personList.add(p1);
    }

    public Person getProfile(int id){
        for (Person p: personList){
            if (p.getId()==id){
             List<Order> list = restTemplate.getForObject("http://ORDER-SERVICE/orderservice/get/orders/"+id, List.class);
               p.setOrderList(list
               );
                return p;
            }
        }
        return null;
    }

}
