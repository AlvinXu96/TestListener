package com.alvin.service;

import com.alvin.bean.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

     void buy(Order order);
}
