package org.example.designPatterns.factoryPatten;

/**
 * @author matao
 * @date 2021-02-04 14:55
 * @description
 */
public class FactoryDemo03 {
    public static void main(String[] args) {
        Car c=Factory3.getCarInstance("Benz");
        if(c!=null){
            c.run();
            c.stop();
        }else{
            System.out.println("造不了这种汽车。。。");
        }


    }
}
