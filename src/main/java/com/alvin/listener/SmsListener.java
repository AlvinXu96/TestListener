package com.alvin.listener;

import com.alvin.event.OrderSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 发送短信监听器
 */
@Component
public class SmsListener implements ApplicationListener<OrderSuccessEvent> {
    @Override
    public void onApplicationEvent(OrderSuccessEvent orderSuccessEvent) {
        System.out.println("发送短信：" + orderSuccessEvent.getOrder().getName());
    }
}
