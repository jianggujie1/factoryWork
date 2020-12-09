package org.gptask;

public class CrossBorderPayFactory implements IPayFactory{
    @Override
    public IPayWay createPay() {
        return new CrossBorderPayWay();
    }
}
