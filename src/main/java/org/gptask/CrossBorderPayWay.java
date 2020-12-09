package org.gptask;

public class CrossBorderPayWay implements IPayWay{
    @Override
    public void pay() {
        System.out.println("跨境支付");
    }
}
