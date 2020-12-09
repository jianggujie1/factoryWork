package org.gptask;

public class WeChatPay implements IPayWay{
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
