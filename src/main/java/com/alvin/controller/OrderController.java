package com.alvin.controller;

import com.alvin.bean.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alvin.service.OrderService;

@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @RequestMapping("/order/buy")
    public Order buy() {
        Order order = new Order(123, "test");

        service.buy(order);

        return order;
    }

}
