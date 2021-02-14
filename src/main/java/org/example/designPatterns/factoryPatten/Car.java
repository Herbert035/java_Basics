package org.example.designPatterns.factoryPatten;

/**
 * @author matao
 * @date 2021-02-04 14:51
 * @description
 */
interface Car {
    public void run();
    public void stop();
}

//具体实现类
class Benz implements Car{
    @Override
    public void run(){
        System.out.println("Benz开始启动了。。。。。");
    }
    @Override
    public void stop(){
        System.out.println("Benz停车了。。。。。");
    }
}
//具体实现类
class Ford implements Car{
    @Override
    public void run(){
        System.out.println("Ford开始启动了。。。");
    }
    @Override
    public void stop(){
        System.out.println("Ford停车了。。。。");
    }
}

/**
 * 简单工厂方式
 * 虽然实现了简单工厂，但每次只能得到一种汽车，如果我们想换一种，就得修改工厂，太不方便，
 */
class Factory{
    public static Car getCarInstance(){
        return new Ford();
    }
}

/**
 * 稍微丰富点的工厂
 * 便得我们可以按照我们的需要更换汽车，但我们所更换的汽车必须是实现类中有的，如果我们想要增加一种汽车的时候，我们还是得更改工厂
 */
class Factory2{
    public static Car getCarInstance(String type){
        Car c=null;
        if("Benz".equals(type)){
            c=new Benz();
        }
        if("Ford".equals(type)){
            c=new Ford();
        }
        return c;
    }
}

/**
 * 实例三利用反射机制，得到汽车类型，这样当我们需要增加一种新的汽车时，就无需要再修改工厂，而只需要增加要实现的类即可。
 * 也就是说要增加什么样的汽车直接增加这个汽车的类即可，而无需改变工厂。从而达到了工厂分离的效果。
 */
class Factory3{

    public static Car getCarInstance(String type){
        Car c=null;
        try {
            c = (Car)Class.forName("org.example.designPatterns.factoryPatten."+type).newInstance();//利用反射得到汽车类型　
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return c;
    }
}



