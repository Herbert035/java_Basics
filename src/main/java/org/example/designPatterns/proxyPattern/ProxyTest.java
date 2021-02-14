package org.example.designPatterns.proxyPattern;

/**
 * @author matao
 * @date 2021-02-04 15:15
 * @description
 */
public class ProxyTest {

    public static void main(String[] args) {
        BuyInterface bi = new ProxyBuyTicket(new BuyTicket());
        bi.buy();
    }

}
