package org.example.designPatterns.proxyPattern;

/**
 * @author matao
 * @date 2021-02-04 15:13
 * @description
 */
public class BuyTicket implements BuyInterface {

    @Override
    public void buy() {
        System.out.println("i am buying a ticket.");
    }

}
