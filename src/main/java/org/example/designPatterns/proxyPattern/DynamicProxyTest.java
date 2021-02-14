package org.example.designPatterns.proxyPattern;

/**
 * @author matao
 * @date 2021-02-04 15:18
 * @description
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        BuyInterface bi = (BuyInterface)DynamicProxyBuyTicket.getProxyObject(new BuyTicket());
        bi.buy();
    }

}
