package org.example.designPatterns.abstractFactoryPatten;

/**
 * @author matao
 * @date 2021-02-04 15:30
 * @description
 */
public class JavaArticle extends Article{

     @Override
     public void produce() {
         System.out.println("编写 JAVA 手记");
     }

}
