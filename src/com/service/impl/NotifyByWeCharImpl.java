package com.service.impl;

import com.service.NotifyService;

public class NotifyByWeCharImpl implements NotifyService {

    @Override
    public void sendMessage(String message) {
        System.out.println("发送`微信`短信:"+message);
    }
}
