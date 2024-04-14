package com.example.order.OrderService.service;

import com.example.order.OrderService.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    static List<Order> list = new ArrayList<>();
    static {
        list.add(new Order(101, "pen", "2.0", "22/02/2023"));
        list.add(new Order(102, "marker", "3.0", "22/02/2023"));
        list.add(new Order(103, "bullet", "4.0", "22/02/2023"));
    }

    public List<Order> getList(int id){
        if (id==1) {
            return list;
        }
        return null;
    }
}
