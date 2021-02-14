package org.example.designPatterns.abstractFactoryPatten;

/**
 * @author matao
 * @date 2021-02-04 15:39
 * @description
 * 抽象工厂模式 测试类
 * 虽然抽象工厂方法模式的类比较多，但是，主要分为4类。
 * AbstractFactory：抽象工厂角色，如CourseFactory类，它声明了一组用于创建一种产品的方法，每一个方法对应一种产品，如创建视频和创建手记。
 * ConcreteFactory：具体工厂角色，如JavaCourseFactory和PythonCourseFactory类，它实现了在抽象工厂中定义的创建产品的方法，生成一组具体产品，这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中。
 * AbstractProduce：抽象产品角色，如Video和Article类，它为每种产品声明接口。
 * ConcreteProduce：具体产品角色，如JavaVideo、JavaArticle、PythonVideo和PythonArticle类，它定义具体工厂生产的具体产品对象，实现抽象产品接口中声明的业务方法。
 *
 */
public class abstractFactoryPattenTest {
    public static void main(String[] args) {
        CourseFactory courseFactory = new PythonCourseFactory() ;
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();

    }
}
