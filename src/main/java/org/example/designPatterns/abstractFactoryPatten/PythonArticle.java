package org.example.designPatterns.abstractFactoryPatten;

/**
 * @author matao
 * @date 2021-02-04 15:37
 * @description
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写 Python 手记");
    }
}
