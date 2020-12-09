package org.gptask;

public class AlipayFactory implements IPayFactory{
    @Override
    public IPayWay createPay() {
        return new AlipayWay();
    }
}
