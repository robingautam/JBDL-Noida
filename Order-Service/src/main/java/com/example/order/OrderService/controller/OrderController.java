package com.example.order.OrderService.controller;

import com.example.order.OrderService.model.Order;
import com.example.order.OrderService.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping
    @RequestMapping("/orderservice/get/orders/{id}")
    public List<Order> getOrders(@PathVariable("id") int id){
        return orderService.getList(id);
    }
}
