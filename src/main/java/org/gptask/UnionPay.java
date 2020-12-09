package org.gptask;

public class UnionPay implements IPayWay{
    @Override
    public void pay() {
        System.out.println("银联支付");
    }
}
