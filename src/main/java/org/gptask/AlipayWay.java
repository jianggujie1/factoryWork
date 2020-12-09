package org.gptask;

public class AlipayWay implements IPayWay{
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
