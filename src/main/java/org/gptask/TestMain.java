package org.gptask;

public class TestMain {
    public static void main(String[] args) {
        //支付宝
        IPayFactory payFactory = new AlipayFactory();
        IPayWay payWay = payFactory.createPay();
        payWay.pay();

        //跨境支付
        payFactory = new CrossBorderPayFactory();
        payWay = payFactory.createPay();
        payWay.pay();

        //微信支付
        payFactory = new WeChatPayFactory();
        payWay = payFactory.createPay();
        payWay.pay();

        //银联支付
        payFactory = new UnionPayFactory();
        payWay = payFactory.createPay();
        payWay.pay();
    }
}
