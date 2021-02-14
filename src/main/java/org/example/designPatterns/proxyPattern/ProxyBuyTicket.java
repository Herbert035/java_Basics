package org.example.designPatterns.proxyPattern;

/**
 * @author matao
 * @date 2021-02-04 15:14
 * @description
 *
 */
public class ProxyBuyTicket implements BuyInterface {

    private BuyTicket bt;

    ProxyBuyTicket(BuyTicket bt){
        this.bt = bt;
    }

    @Override
    public void buy() {
        preRequest();
        System.out.println("i am using proxy to buy a ticket");
        bt.buy();
        postRequest();
    }

    private void preRequest() {
        // something you want to do before requesting
    }

    private void postRequest() {
        // something you want to do after requesting
    }

}
