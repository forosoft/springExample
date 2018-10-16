package com.demo;

import com.dao.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order = ctx.getBean("order", Order.class);
        order.PaySuccess();
    }

}
