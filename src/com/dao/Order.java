package com.dao;

import com.service.NotifyService;

//IoC容器创建 Order 对象

public class Order {

    public Order(){

    }

    private NotifyService notifyService;

    /*
        notifyService 不是在内部 new() 出来的，
        而是通过指定方法传进来的，也就是我们说的注入。
        这里是setter注入
    */
    public void setNotifyService(NotifyService notifyService) {
        this.notifyService = notifyService;
    }

    public NotifyService getNotifyService() {
        return this.notifyService;
    }

    /*订单支付完成后，系统通知*/
    public void PaySuccess(){
        notifyService.sendMessage("客户张铁蛋完成付款，共人民币:97.5元");
    }
}
