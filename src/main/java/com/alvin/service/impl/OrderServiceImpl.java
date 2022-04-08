package com.alvin.service.impl;

import com.alvin.bean.Order;
import com.alvin.event.OrderSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;
import com.alvin.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService, ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void buy(Order order) {
        System.out.println("下单成功：" + order.getName());

        //发布事件
        publisher.publishEvent(new OrderSuccessEvent(this, order));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;

    }
}
