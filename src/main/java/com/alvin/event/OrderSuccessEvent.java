package com.alvin.event;

import com.alvin.bean.Order;
import org.springframework.context.ApplicationEvent;

/**
 * 事件
 */
public class OrderSuccessEvent extends ApplicationEvent {
    private Order order;

    public OrderSuccessEvent(Object source) {
        super(source);
    }

    public OrderSuccessEvent(Object source, Order order) {
        super(source);
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
