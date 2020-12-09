package org.gptask;

public class UnionPayFactory implements IPayFactory{
    @Override
    public IPayWay createPay() {
        return new UnionPay();
    }
}
