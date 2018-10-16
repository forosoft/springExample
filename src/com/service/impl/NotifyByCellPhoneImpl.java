package com.service.impl;

import com.service.NotifyService;

public class NotifyByCellPhoneImpl implements NotifyService {

    @Override
    public void sendMessage(String message) {
        System.out.println("发送`手机`短信:"+message);
    }
}
