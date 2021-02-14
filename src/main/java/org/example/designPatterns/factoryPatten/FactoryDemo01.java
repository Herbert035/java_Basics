package org.example.designPatterns.factoryPatten;

/**
 * @author matao
 * @date 2021-02-04 14:55
 * @description
 */
public class FactoryDemo01 {

    public static void main(String[] args) {
        Car c=Factory.getCarInstance();
        c.run();
        c.stop();
    }

}
