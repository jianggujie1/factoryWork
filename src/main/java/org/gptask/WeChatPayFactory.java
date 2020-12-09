package org.gptask;

public class WeChatPayFactory implements IPayFactory{
    @Override
    public IPayWay createPay() {
        return new WeChatPay();
    }
}
